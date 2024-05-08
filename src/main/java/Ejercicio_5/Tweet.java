package Ejercicio_5;

import java.time.LocalDateTime;

public class Tweet {
    private String content;
    private LocalDateTime time;
    private UserAccount sender;

    public Tweet(String content, LocalDateTime time, UserAccount sender) {
        if (content.length() > 140) {
            throw new IllegalArgumentException("Content exceeds the maximum length of 140 characters");
        }
        this.content = content;
        this.time = time;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public UserAccount getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "content='" + content + '\'' +
                ", time=" + time +
                ", sender=" + sender +
                '}';
    }
}