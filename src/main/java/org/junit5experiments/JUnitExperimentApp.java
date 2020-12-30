package org.junit5experiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JUnitExperimentApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(
                JUnitExperimentApp.class, args);
    }
}
