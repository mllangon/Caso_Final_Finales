package Ejercicio_5;

public class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        if (!Utils.isValidEmail(emailAddress)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.emailAddress = emailAddress;
    }

    public String getEmail() {
        return emailAddress;
    }
}