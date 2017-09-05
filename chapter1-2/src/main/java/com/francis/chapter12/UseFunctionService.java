package com.francis.chapter12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UseFunctionService {
    private FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
