package com.historyshare.eurekaserver;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Package-name:com.historyshare.eurekaserver
 * Time:2020/3/8-16:58.
 * Autor:computer-Administrator--zhangtianxiao
 * Note:GOOD PROGRAMER.
 */

@SpringBootApplication
@EnableEurekaServer
public class StartApp {
    public static void main(String[] args){
        System.out.println("hello world!!!");
        //SpringApplication.run(StartApp.class, args);
        new SpringApplicationBuilder(StartApp.class).web(WebApplicationType.SERVLET).run(args);
    }
}
