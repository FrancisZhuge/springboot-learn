package com.francis.chapter43;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoInterceptor extends HandlerInterceptorAdapter{
    @Autowired
    private Holder<Long> holder;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        holder.setValue(currentTimeMillis);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Long holderValue = holder.getValue();
        long endTime = System.currentTimeMillis();
        System.out.println("本次处理时间为："+(endTime-holderValue));
    }
}
