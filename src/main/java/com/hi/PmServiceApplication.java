package com.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hi"}, exclude = {})
public class PmServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PmServiceApplication.class, args);
    }

}
