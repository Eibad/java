package com.slack.slakIntegration.slack.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.slack.slakIntegration.slack.domain.TeamMessage;
import com.slack.slakIntegration.slack.service.SlackService;
import com.slack.slakIntegration.slack.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.slack.slakIntegration.slack.domain.SlackMessage;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/api/v1")
public class SlackController {

    private final SlackService slackService;

    private TeamsService teamsService;




    public SlackController(SlackService slackService) {
        this.slackService = slackService;
    }

//    public SlackController(TeamsService teamsService) {
//        this.teamsService = teamsService;
//    }


    @PostMapping("/slack")
    public void sendMessage(@RequestBody SlackMessage slackMessage) {
        String message = slackMessage.getMessage() + " " + slackMessage.getEmoji();
        slackService.sendMessageToSlack(message) ;
    }

//    @PostMapping("/tems")
//    public void sendMessage(@RequestBody TeamMessage slackMessage) {
//        String message = slackMessage.getText() + " " + slackMessage.getSummary(); ;
//        teamsService.sendMessageToSlack(message);
//    }
}
