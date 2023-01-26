package com.slack.slakIntegration;

import java.io.Serializable;

public class Request implements Serializable{

    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Request() {
    }
}
