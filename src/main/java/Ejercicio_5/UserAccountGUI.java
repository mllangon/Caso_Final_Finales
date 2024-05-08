package Ejercicio_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.util.HashMap;

public class UserAccountGUI extends JFrame {
    private UserAccount currentUser;
    private JTextField aliasField;
    private JTextField emailField;
    private JTextField tweetField;
    private JTextField followField;
    private JTextField dmAliasField;
    private JTextField dmContentField;
    private JTextField rtAliasField;
    private JComboBox<Tweet> rtComboBox;
    private JTextArea outputArea;
    private JButton createButton;
    private JButton tweetButton;
    private JButton followButton;
    private JButton dmButton;
    private JButton rtButton;
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

        // Formulario para tweetear, seguir a otro usuario, enviar un mensaje directo y retweetear
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

        card2.add(new JLabel("Direct Message (alias):"));
        dmAliasField = new JTextField(20);
        card2.add(dmAliasField);

        card2.add(new JLabel("Direct Message (content):"));
        dmContentField = new JTextField(20);
        card2.add(dmContentField);

        dmButton = new JButton("Send DM");
        dmButton.addActionListener(this::sendDM);
        card2.add(dmButton);

        card2.add(new JLabel("Retweet (alias):"));
        rtAliasField = new JTextField(20);
        card2.add(rtAliasField);

        rtComboBox = new JComboBox<>();
        rtComboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Tweet) {
                    setText(((Tweet) value).getContent());
                }
                return this;
            }
        });
        card2.add(rtComboBox);

        rtButton = new JButton("Retweet");
        rtButton.addActionListener(this::retweet);
        card2.add(rtButton);

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
            Tweet tweet = new Tweet(tweetContent, LocalDateTime.now(), currentUser);
            currentUser.tweet(tweet);
            outputArea.append("Tweeted: " + tweetContent + "\n");
            rtComboBox.addItem(tweet);
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

    private void sendDM(ActionEvent e) {
        if (currentUser != null) {
            String dmAlias = dmAliasField.getText().trim();
            String dmContent = dmContentField.getText().trim();
            UserAccount userToDM = allUsers.get(dmAlias);
            if (userToDM != null && !dmAlias.equals(currentUser.getAlias())) {
                DirectMessage dm = new DirectMessage(dmContent, LocalDateTime.now(), currentUser, userToDM);
                currentUser.tweet(dm);
                outputArea.append("Sent DM to: " + dmAlias + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "User not found or invalid operation.");
            }
        }
    }

    private void retweet(ActionEvent e) {
        if (currentUser != null && rtComboBox.getSelectedItem() != null) {
            Tweet originalTweet = (Tweet) rtComboBox.getSelectedItem();
            Retweet rt = new Retweet("RT: " + originalTweet.getContent(), LocalDateTime.now(), currentUser, originalTweet);
            currentUser.tweet(rt);
            outputArea.append("Retweeted: " + originalTweet.getContent() + "\n");
        } else {
            JOptionPane.showMessageDialog(this, "No tweet to retweet or no user logged in.");
        }
    }

    public static void main(String[] args) {
        new UserAccountGUI();
    }
}