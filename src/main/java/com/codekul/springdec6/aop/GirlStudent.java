package com.codekul.springdec6.aop;

import org.springframework.stereotype.Component;

@Component
public class GirlStudent {

    public void studied(String st,String rt1){
        System.out.println("Girl Study");
    }
}
