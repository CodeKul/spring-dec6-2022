package com.codekul.springdec6.aop;

import org.springframework.stereotype.Component;

@Component
public class BoyStudent {

    public int study(int i){
        System.out.println("Boys Study");
        return 23;
    }

    public void exe(String str) throws Exception {
        throw new Exception(str);
    }
}
