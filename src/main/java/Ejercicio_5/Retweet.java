package Ejercicio_5;

import java.time.LocalDateTime;

public class Retweet extends Tweet {
    private Tweet originalTweet;

    public Retweet(String content, LocalDateTime time, UserAccount sender, Tweet originalTweet) {
        super(content, time, sender);
        this.originalTweet = originalTweet;
    }

    public Tweet getOriginalTweet() {
        return originalTweet;
    }

    @Override
    public String toString() {
        return "Retweet{" +
                "originalTweet=" + originalTweet +
                "} " + super.toString();
    }
}