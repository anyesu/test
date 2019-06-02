package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anyesu
 */
@RestController
@SpringBootApplication
public class Application {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/")
    public String test() {
        logger.info("access");
        return "This is a test result.";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
