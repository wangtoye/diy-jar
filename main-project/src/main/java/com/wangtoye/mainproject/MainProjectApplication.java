package com.wangtoye.mainproject;

import com.wangtoye.worldjarspringbootstarter.annotation.EnableWorldJar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.wangtoye.mainproject", "com.wangtoye.hellojar"})
@EnableWorldJar
public class MainProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainProjectApplication.class, args);
    }

}
