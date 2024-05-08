import Ejercicio_5.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserAccountTest {

    @Test
    public void testFollow() {
        UserAccount user1 = new UserAccount("user1", new Email("user1@example.com"), "password1");
        UserAccount user2 = new UserAccount("user2", new Email("user2@example.com"), "password2");

        user1.follow(user2);

        assertTrue(user1.getFollowing().contains(user2));
        assertTrue(user2.getFollowers().contains(user1));
    }

    @Test
    public void testTweet() {
        UserAccount user = new UserAccount("user", new Email("user@example.com"), "password");
        Tweet tweet = new Tweet("Hello, world!", LocalDateTime.now(), user);

        user.tweet(tweet);

        assertTrue(user.getTweets().contains(tweet));
    }
}