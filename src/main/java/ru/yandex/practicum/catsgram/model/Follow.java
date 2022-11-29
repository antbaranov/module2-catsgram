package ru.yandex.practicum.catsgram.model;

public class Follow {
    String author;
    String follower;

    public Follow(String authorId, String followerId) {
        this.author = authorId;
        this.follower = followerId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }
}
