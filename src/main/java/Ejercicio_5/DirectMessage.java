package Ejercicio_5;

import java.time.LocalDateTime;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(String content, LocalDateTime time, UserAccount sender, UserAccount receiver) {
        super(content, time, sender);
        this.receiver = receiver;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "receiver=" + receiver +
                "} " + super.toString();
    }
}