package org.cong.x.project.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liaojuncong on 03/10/2016.
 */
@Slf4j
@SpringBootApplication
public class Application {
    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
       log.info("============= SpringBoot Start Success =============");
    }
}
