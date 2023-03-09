package com.example.eimzointegration.service;


import com.example.eimzointegration.repository.AttachmentContentFileRepository;
import com.example.eimzointegration.repository.AttachmentFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachmentFileService {

    @Autowired
    AttachmentFileRepository attachmentFileRepository;

    @Autowired
    AttachmentContentFileRepository attachmentContentFileRepository;

    

}
