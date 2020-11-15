package com.sample.di_container.application.tweet;

public class Tweet {

    final String message;

    public Tweet(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "message：" + message;
    }
}
