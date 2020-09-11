package com.gsm.controller;

import com.gsm.utils.FileUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("file")
public class FileController {

    @PostMapping("demo")
    public String storeFile(MultipartFile file) {
        boolean b = FileUtil.storeFileByName(file, "D://a//b", file.getOriginalFilename());
        return "存储成功";
    }

    @PostMapping("demo/files")
    public String storeFiles(List<MultipartFile> files) {
        for (MultipartFile file : files) {
            boolean b = FileUtil.storeFileByName(file, "D://a//b", file.getOriginalFilename());
        }
        return "存储成功";
    }
}
