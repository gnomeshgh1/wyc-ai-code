package com.wyc.wycaicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wyc.wycaicode.mapper")
public class WycAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WycAiCodeApplication.class, args);
    }

}
