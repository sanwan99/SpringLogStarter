package com.fhl.teststarter;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@EnableApolloConfig
@ServletComponentScan
@SpringBootApplication
public class TeststarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeststarterApplication.class, args);
    }

}
