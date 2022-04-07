package com.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class ShopingCart {
    public void chekout() {
        System.out.println("checkout...");
    }
}
