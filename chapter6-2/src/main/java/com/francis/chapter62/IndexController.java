package com.francis.chapter62;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${book.author}")
    private String author;
    @Value("${book.name}")
    private String name;

    @RequestMapping("/")
    public String index(){
        return "book name is:"+name+" and the author is: "+author;
    }
}
