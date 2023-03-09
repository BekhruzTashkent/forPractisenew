package com.example.eimzointegration.service;

import com.example.eimzointegration.entity.Type;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.lang.System;


public class typeService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://jira.atlassian.com/rest/api/2/issueLink/50308";
    String responce = restTemplate.getForObject(url, String.class);



    ObjectMapper objectMapper = new ObjectMapper();
    Type type = objectMapper.readValue(responce, Type.class);

    public typeService() throws JsonProcessingException {
        System.out.println();
    }

    int typeId = type.getId();
    String name = type.getName();
    String inward = type.getInward();

    public class

}
