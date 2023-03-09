package com.example.eimzointegration.payload;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FileDto {

    private String name;

    private String file_original_name;

    private MultipartFile file;

}
