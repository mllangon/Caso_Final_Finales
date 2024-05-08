package Ejercicio_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;

public class UserAccountGUI extends JFrame {
    private UserAccount currentUser;
    private JTextField aliasField;
    private JTextField emailField;
    private JTextField tweetField;
    private JTextField followField;
    private JTextArea outputArea;
    private JButton createButton;
    private JButton tweetButton;
    private JButton followButton;
    private JButton backButton;
    private JPanel cards;

    private HashMap<String, UserAccount> allUsers = new HashMap<>();

    public UserAccountGUI() {
        super("User Account Manager");
        setLayout(new BorderLayout());

        // Formulario para crear una cuenta
        JPanel card1 = new JPanel(new FlowLayout());
        card1.add(new JLabel("Alias:"));
        aliasField = new JTextField(20);
        card1.add(aliasField);

        card1.add(new JLabel("Email:"));
        emailField = new JTextField(20);
        card1.add(emailField);

        createButton = new JButton("Create Account");
        createButton.addActionListener(this::createAccount);
        card1.add(createButton);

        // Formulario para tweetear y seguir a otro usuario
        JPanel card2 = new JPanel(new FlowLayout());

        card2.add(new JLabel("Tweet:"));
        tweetField = new JTextField(20);
        card2.add(tweetField);

        tweetButton = new JButton("Tweet");
        tweetButton.addActionListener(this::tweet);
        card2.add(tweetButton);

        card2.add(new JLabel("Follow user (alias):"));
        followField = new JTextField(20);
        card2.add(followField);

        followButton = new JButton("Follow");
        followButton.addActionListener(this::follow);
        card2.add(followButton);

        // Botón para volver a la pantalla de creación de cuenta
        backButton = new JButton("Back");
        backButton.addActionListener(e -> ((CardLayout) cards.getLayout()).show(cards, "Create Account"));
        card2.add(backButton);

        // Área de texto para salida de mensajes
        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        card2.add(new JScrollPane(outputArea));

        // Panel principal con CardLayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, "Create Account");
        cards.add(card2, "User Actions");

        add(cards, BorderLayout.CENTER);

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createAccount(ActionEvent e) {
        String alias = aliasField.getText().trim();
        String email = emailField.getText().trim();
        if (!alias.isEmpty() && !email.isEmpty()) {
            Email emailObj = new Email(email);
            currentUser = new UserAccount(alias, emailObj);
            allUsers.put(alias, currentUser);
            ((CardLayout) cards.getLayout()).show(cards, "User Actions");
        } else {
            JOptionPane.showMessageDialog(this, "Alias and email cannot be empty.");
        }
    }

    private void tweet(ActionEvent e) {
        if (currentUser != null && !tweetField.getText().trim().isEmpty()) {
            String tweetContent = tweetField.getText().trim();
            Tweet tweet = new Tweet(tweetContent);
            currentUser.tweet(tweet);
            outputArea.append("Tweeted: " + tweetContent + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "No content to tweet or no user logged in.");
        }
    }

    private void follow(ActionEvent e) {
        if (currentUser != null) {
            String followAlias = followField.getText().trim();
            UserAccount userToFollow = allUsers.get(followAlias);
            if (userToFollow != null && !followAlias.equals(currentUser.getAlias())) {
                currentUser.follow(userToFollow);
                outputArea.append("Following: " + followAlias + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "User not found or invalid operation.");
            }
        }
    }

    public static void main(String[] args) {
        new UserAccountGUI();
    }
}