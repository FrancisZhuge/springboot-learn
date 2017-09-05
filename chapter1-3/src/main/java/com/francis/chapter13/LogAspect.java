package com.francis.chapter13;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Pointcut("bean(*Service)")
    public void pointcut(){}
    @Before("pointcut()")
    public void before(){
        System.out.println("before Method");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("after Method");
    }
    @Around("pointcut()")
    public void arount(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("around before Method");
        try {
            proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around after Method");
    }
}
