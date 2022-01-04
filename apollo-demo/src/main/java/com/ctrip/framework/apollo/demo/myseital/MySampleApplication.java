package com.ctrip.framework.apollo.demo.myseital;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author myseital
 * @date 2022/1/4 14:11
 */
@EnableApolloConfig
@SpringBootApplication
public class MySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySampleApplication.class, args);
    }
}
