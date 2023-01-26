package com.slack.slakIntegration.slack.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
@Service
public class TeamsService {

    private final RestTemplate restTemplate;

    public TeamsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendMessageToSlack(String message)  {
        String url = "https://nisum0.webhook.office.com/webhookb2/6ebe95af-de73-4df3-8752-ff9d2a97cc9a@06408ebc-5eb8-4b0d-827f-76dd3b58bc84/IncomingWebhook/d487cc375c584e558975d1084d06597e/ee1bbb3a-b015-4f4f-82ab-80a4396e79a7'";
        Map<String,String> stringBuilder = new HashMap<>();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        stringBuilder.put("text",message);
        HttpEntity<Map<String,String>> request= new HttpEntity<>(stringBuilder,httpHeaders);
        restTemplate.postForEntity(url,request,String.class);
    }
}
