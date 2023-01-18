package com.codekul.springdec6.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

//    @After("pointCut()")//advice
//    public void wakeUp() {
//        System.out.println("Wake up");
//    }
//    @Before("pointCut()")//advice
//    public void sleep() {
//        System.out.println("sleep");
//    }

    @Pointcut(value ="execution(* com.codekul.springdec6.aop.GirlStudent.*(..))")
    public void pointCut(){}

    @AfterReturning(value = "execution(public int study(..))",returning = "intValue")
    public void wakeUp(int intValue) {
        System.out.println("Wake up "+ intValue);
    }
    @AfterThrowing(value = "execution(public void exe(..))",throwing = "throwValue")
    public void showExc(Exception throwValue){
        System.out.println("In exception =>"+ throwValue);
    }
}
