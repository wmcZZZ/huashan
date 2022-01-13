package com.wmc.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@MapperScan("com.wmc.app.mapper")
@SpringBootApplication
public class AppApplication {
    public static void main( String[] args ) {
        SpringApplication.run(AppApplication.class,args);
    }
}
