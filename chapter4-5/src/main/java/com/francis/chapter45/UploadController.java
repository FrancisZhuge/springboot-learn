package com.francis.chapter45;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    @RequestMapping("/upload")
    @ResponseBody String upload(MultipartFile file){
        String filename = file.getOriginalFilename();
        System.out.println(filename);
        return "OK";
    }
}
