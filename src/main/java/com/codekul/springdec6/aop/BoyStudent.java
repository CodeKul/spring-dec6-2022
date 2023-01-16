package com.codekul.springdec6.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public void study(int i){
        System.out.println("Boys Study");
    }
}
