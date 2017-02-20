package com.farenda.solved;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Tells Spring to consider this bean for handling incoming web requests
@Controller
// Tells Spring to guess application type based on its dependencies and
// setup application context accordingly:
@EnableAutoConfiguration
public class JavaSolved {

    // Make application accessible under http://localhost:8080/ path:
    @RequestMapping("/")
    // Tells to convert return value into HTTP response:
    @ResponseBody
    String home() {
        return "Hello, Spring Boot World!";
    }

    public static void main(String[] args) throws Exception {
        // Lets Spring bootstrap the application with
        // preconfigured Tomcat. The class name is used
        // to indicate primary Spring component:
        SpringApplication.run(JavaSolved.class, args);
        Thread.sleep(100000 );
    }
}