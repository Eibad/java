package com.slack.slakIntegration.slack.domain;

public class SlackMessage {

    private String message;
    private String emoji;



    public SlackMessage(String message, String emoji) {
        this.message = message;
        this.emoji = emoji;
    }

    public SlackMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getEmoji() {
        return emoji;
    }
}
