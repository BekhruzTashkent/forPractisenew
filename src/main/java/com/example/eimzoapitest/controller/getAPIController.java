package com.example.eimzoapitest.controller;

import com.example.eimzoapitest.entity.Type;
import com.example.eimzoapitest.payload.FileDto;
import com.example.eimzoapitest.repository.TypeRepository;
import com.example.eimzoapitest.service.JsonObjectService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class getAPIController {

    private final JsonObjectService jsonObjectService;

    @Autowired
    TypeRepository typeRepository;

    public getAPIController(JsonObjectService jsonObjectService) {
        this.jsonObjectService = jsonObjectService;
    }

    @GetMapping("/")
    public HttpEntity<?> getAPIResponse() {

        String apiUrl = "https://jira.atlassian.com/rest/api/latest/issue/JRA-9";

        JSONObject jsonObject = jsonObjectService.getApiResponse(apiUrl);

        System.out.println("jsonObject.getString(\"key\") = " + jsonObject.getString("key"));

        System.out.println("jsonObject.getJSONObject(\"fields\").get(\"customfield_18232\") = "
                + jsonObject.getJSONObject("fields").get("customfield_18232"));

        System.out.println("jsonObject.getJSONObject(\"fields\").getJSONObject(\"fixVersions\").getMapType(\"releaseDate\") = "
                + jsonObject.getJSONObject("fields").getJSONObject("resolution").get("description"));

        System.out.println("jsonObject.getJSONObject(\"fields\").getJSONArray(\"fixVersions\").getJSONObject(0).getString(\"name\") = "
                + jsonObject.getJSONObject("fields").getJSONArray("fixVersions").getJSONObject(0).getString("name"));

//        System.out.println("jsonObject.getJSONObject(\"key\") = " + jsonObject.getJSONObject("key").toString());


        //example of saving into db
        Type type = new Type();
//        type.setKey(jsonObject.getString("key"));
//        type.setExpand(jsonObject.getString("expand"));
//        type.setLastName("name1");
//        type.setLastNamehh("name2");
//        type.setLastNamehhg("NAME3");
//        typeRepository.save(type);

        return ResponseEntity.ok(jsonObject);

    }

    @GetMapping("/qwerty")
    public HttpEntity<?> getAllDocInfo(){
        String apiUrl = "https://jira.atlassian.com/rest/api/2/issuetype/10000";
        JSONObject jsonObject = jsonObjectService.getApiResponse(apiUrl);

//       List<DocInfo> docInfo = (List<DocInfo>) jsonObject.getJSONObject("fields");
        Type type = new Type();
        type.setName( jsonObject.getString("name"));
        return new ResponseEntity<>(type, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public HttpEntity<?> getAllDocInfo1(){
        String apiUrl = "https://jira.atlassian.com/rest/api/2/issuetype/10000";
        JSONObject jsonObject = jsonObjectService.getApiResponse(apiUrl);

//       List<DocInfo> docInfo = (List<DocInfo>) jsonObject.getJSONObject("fields");
        FileDto fileDto = new FileDto();
        fileDto.setName( jsonObject.getString("name"));
        return new ResponseEntity<>(fileDto, HttpStatus.OK);
    }

}
