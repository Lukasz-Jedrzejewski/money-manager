package com.legion.moneymanager.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication(scanBasePackages = "com.legion")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
