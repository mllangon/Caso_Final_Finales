package Ejercicio_5;

import java.util.ArrayList;
import java.util.HashSet;

public class UserAccount {
    private String alias;
    private Email email;
    private ArrayList<Tweet> tweets;
    private ArrayList<Tweet> timeline;
    private HashSet<UserAccount> followers;
    private HashSet<UserAccount> following;

    public UserAccount(String alias, Email email) {
        if (!Utils.isValidAlias(alias) || !Utils.isValidEmail(email.getEmail())) {
            throw new IllegalArgumentException("Invalid alias or email");
        }
        this.alias = alias;
        this.email = email;
        this.tweets = new ArrayList<>();
        this.timeline = new ArrayList<>();
        this.followers = new HashSet<>();
        this.following = new HashSet<>();
    }

    public String getAlias() {
        return alias;
    }

    public void follow(UserAccount user) {
        if (user != null && !this.following.contains(user)) {
            this.following.add(user);
            user.followers.add(this);
        }
    }

    public void tweet(Tweet tweet) {
        if (tweet.getContent().length() > 140) {
            throw new IllegalArgumentException("Content exceeds the maximum length of 140 characters");
        }
        this.tweets.add(tweet);
        for (UserAccount follower : followers) {
            follower.timeline.add(tweet);
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email=" + email.getEmail() +
                '}';
    }
}

class Utils {
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static boolean isValidAlias(String alias) {
        return alias.matches("^[a-zA-Z0-9]+$");
    }
}
