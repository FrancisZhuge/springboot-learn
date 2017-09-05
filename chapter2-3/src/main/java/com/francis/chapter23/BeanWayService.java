package com.francis.chapter23;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanWayService {
    @PostConstruct
    public void init(){
        System.out.println("init Method");
    }

    public BeanWayService() {
        System.out.println("构造函数初始化");
    }
    @PreDestroy
    public void destory(){
        System.out.println("desotry Method");
    }
}
