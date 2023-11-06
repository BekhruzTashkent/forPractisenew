package com.example.eimzoapitest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EimzoApiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EimzoApiTestApplication.class, args);
//        TypeService typeService = null;
//        try {
//            typeService = new TypeService();
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        typeService.showData();

//        JsonObjectService jsonObjectService = new JsonObjectService();
//        jsonObjectService.showResult();
    }
}
