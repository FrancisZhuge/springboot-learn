package com.francis.chapter22;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan("com.francis.chapter22")
@PropertySource("classpath:test.txt")
public class Config {
    @Value("I LOVE YOU")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{demoService.another}")
    private String fromAnother;
    @Value("classpath:test.txt")
    private Resource resource;
    @Value("http://www.baidu.com")
    private Resource url;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    Environment environment;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyResolver(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(fromAnother);
        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
            System.out.println(IOUtils.toString(url.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(bookName);
        System.out.println(environment.getProperty("book.author"));
    }
}
