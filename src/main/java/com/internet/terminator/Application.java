package com.internet.terminator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.internet.terminator.Application class
 *
 * @author liqingtai
 * @date 2020年05月09日
 */
@MapperScan("com.example.demo.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
