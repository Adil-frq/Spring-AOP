package com.demo.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {
      "com.demo.aop",
        "com.aop.demo.util"
})
@EnableAspectJAutoProxy
public class AppConfig {
}
