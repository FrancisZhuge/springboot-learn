package com.francis.chapter25;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("get message and message = "+msg);
    }
}
