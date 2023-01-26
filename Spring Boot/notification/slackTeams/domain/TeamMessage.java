package com.slack.slakIntegration.slack.domain;

public class TeamMessage {

    private String text;

    private  String summary;

    public String getText() {
        return text;
    }

    public String getSummary() {
        return summary;
    }

    public TeamMessage(String text, String summary) {
        this.text = text;
        this.summary = summary;
    }

    public TeamMessage() {
    }
}

