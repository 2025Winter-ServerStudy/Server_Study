package com.hsu.test.domain.controller;

import com.hsu.test.global.aws.s3.service.AwsS3Service;
import com.hsu.test.global.response.CustomAPIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequiredArgsConstructor
@RequestMapping("/file")
public class AmazonS3Controller {
    private final AwsS3Service awsS3Service;

    @PostMapping
    public ResponseEntity<CustomAPIResponse<?>> uploadFile(MultipartFile multipartFile) {
        return ResponseEntity.ok(awsS3Service.uploadFile(multipartFile));
    }

    @DeleteMapping
    public ResponseEntity<CustomAPIResponse<?>> deleteFile(String fileName) {
        return ResponseEntity.ok(awsS3Service.deleteFile(fileName));
    }
}
