package com.aop.demo.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
    @Before("execution(* com.demo.aop.ShopingCart.chekout())")
    public void logger() {
        System.out.println("logger");
    }
}
