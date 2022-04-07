package com.demo.aop;

import com.aop.demo.util.LogginAspect;
import com.demo.aop.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ShopingCart cart = context.getBean(ShopingCart.class);
        cart.chekout();


    }
}
