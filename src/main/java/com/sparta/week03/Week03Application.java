package com.sparta.week03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Week03Application {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.properties,"
            + "/home/ubuntu/app/config/springboot-webservice/real-application.yml";

    public static void main(String[] args) {
        SpringApplication.run(Week03Application.class, args);
    }

}
