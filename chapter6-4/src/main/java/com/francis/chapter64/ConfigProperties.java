package com.francis.chapter64;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigProperties {
    @Value("${author}")
    private String author;
    public void outputProperties(){
        System.out.println(author);
    }
}
