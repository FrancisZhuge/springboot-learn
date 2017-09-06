package com.francis.chapter34;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.francis.chapter34")
public class Config {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
