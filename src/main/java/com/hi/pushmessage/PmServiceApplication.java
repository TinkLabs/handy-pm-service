package com.hi.pushmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hi.pushmessage"}, exclude = {})
public class PmServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmServiceApplication.class, args);
    }

}
