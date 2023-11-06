package com.example.eimzoapitest.service;

import org.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JsonObjectService{

    private final RestTemplate restTemplate;

    public JsonObjectService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public JSONObject getApiResponse(String apiUrl) {
        String apiResponse = restTemplate.getForObject(apiUrl, String.class);
        JSONObject jsonObject = new JSONObject(apiResponse);
        return jsonObject;
    }

//    public void getInfoFromAPI() {
//        try {
//            String apiUrl = "https://jira.atlassian.com/rest/api/latest/issue/JRA-9?expand=names,renderedFields";
//            URL url = new URL(apiUrl);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            StringBuilder responseBuilder = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                responseBuilder.append(line);
//            }
//            reader.close();
//            conn.disconnect();
//
//            String apiResponse = responseBuilder.toString();
//            JSONObject jsonObject = new JSONObject(apiResponse);
//
//            String name = jsonObject.getString("key");
//            System.out.println("name = " + name);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//        String apiUrl = "https://jira.atlassian.com/rest/api/latest/issue/JRA-9?expand=names,renderedFields";
//        URL url;
//
//        {
//            try {
//                url = new URL(apiUrl);
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        HttpURLConnection conn;
//
//        {
//            try {
//                conn = (HttpURLConnection) url.openConnection();
//                conn.setRequestMethod("GET");
//                conn.disconnect();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        BufferedReader reader;
//
//        {
//            try {
//                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        StringBuilder responseBuilder = new StringBuilder();
//        String line;
//        while ((line = reader.readLine()) != null) {
//            responseBuilder.append(line);
//        }
//        reader.close();
//        conn.disconnect();
//
//        //Create a JSONObject from the API response
//        String apiResponse = responseBuilder.toString();
//        JSONObject jsonObject = new JSONObject(apiResponse);
//
//        String name = jsonObject.getString("customfield_20430");
//
//        public void showResult () {
//        System.out.println(name);
//    }


}
