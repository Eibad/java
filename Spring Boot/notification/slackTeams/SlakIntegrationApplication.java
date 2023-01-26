package com.slack.slakIntegration;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.util.MimeType;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SlakIntegrationApplication {

	public static void main(String[] args) throws IOException, InterruptedException {SpringApplication.run(SlakIntegrationApplication.class, args);
//RestTemplate restTemplate = new RestTemplate();
//		String url = "https://nisumtech.atlassian.net//rest/api/3/search?jql=summary~%22Test%20suite%20execution%20of%20Project%20Test%20Executed%22";
//
//		String decoded = URLDecoder.decode(url, "UTF-8");
//
//		HttpHeaders httpHeaders = new HttpHeaders();
//		String plainCreds = "amsharma@nisum.com:j41wn70GSKUXVx5bQ9oiE935";
//		byte[] plainCredsBytes = plainCreds.getBytes();
//		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
//
//		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//		httpHeaders.add("Authorization", "Basic " + new String(base64CredsBytes));
//
//		LinkedHashMap map = new LinkedHashMap();
//
//		HttpEntity  request= new HttpEntity("issues",httpHeaders);
//	   ResponseEntity<Object> response = restTemplate.exchange(decoded,HttpMethod.GET,request,Object.class);
//		ArrayList issue = (ArrayList) ((LinkedHashMap) response.getBody()).get("issues");
//		String url1="https://nisumtech.atlassian.net/rest/api/3/issue/{issueId}/comment";
//		String issueId = ((LinkedHashMap) issue.get(0)).get("key").toString();
//		url1 = url1.replace("{issueId}",issueId);
//		//String jsonRequest = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString("this is test");
////		Request req = new Request();
////		req.setBody("this is test");
////		String jsonRequest = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(req);
////		HttpEntity<String>  requestcom= new HttpEntity<String>(jsonRequest,httpHeaders);
////		String decoded1 = URLDecoder.decode(url1, "UTF-8");
////
////
////		ResponseEntity<Object> update = restTemplate.postForEntity(decoded1,requestcom,Object.class);
////		System.out.println(response);
//
//
//		RestTemplate restTemplate1 = new RestTemplate();
//
//		HttpHeaders httpHeaders1 = new HttpHeaders();
//		httpHeaders1.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
//		httpHeaders1.add("Authorization", "Basic " + new String(base64CredsBytes));
//
//		Request request1 = new Request();
//		request1.setBody("hi");
//
//		String jsonRequest = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(request1);
//
//		HttpEntity httpEntity = new HttpEntity(jsonRequest, httpHeaders1);
//
//
//		ResponseEntity<Object> exchange = restTemplate1.exchange(url1, HttpMethod.POST, httpEntity, Object.class);



	}
}
