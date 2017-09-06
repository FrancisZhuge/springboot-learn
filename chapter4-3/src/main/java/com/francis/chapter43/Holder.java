package com.francis.chapter43;

import org.springframework.stereotype.Component;

@Component
public class Holder<T> {
    private ThreadLocal<T> tThreadLocal = new ThreadLocal<>();

    public void setValue(T t){
        tThreadLocal.set(t);
    }
    public T getValue(){
        return tThreadLocal.get();
    }
    public void clear(){
        tThreadLocal.remove();
    }
}
