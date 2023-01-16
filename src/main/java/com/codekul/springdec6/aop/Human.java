package com.codekul.springdec6.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

    @After("execution(* com.codekul.springdec6.validation.GirlStudent.*(..))")
    public void wakeUp(){
        System.out.println("Wake up");
    }
}
