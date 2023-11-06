package com.example.eimzoapitest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Type {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String name;

//        private String expand;
//
//        @Column(name = "custom5424")
//        private String firstName;
//
//        private String firstName_custom5432;
//
//        private String lastName = JiraMapper.lastName;
//
//
//        private String lastNamehh = JiraMapper.lastName1;
//
//        private String lastNamehhg = JiraMapper.lastName2;

}
