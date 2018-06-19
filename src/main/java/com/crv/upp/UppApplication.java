package com.crv.upp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class UppApplication {

    public static void main(String[] args) {
        SpringApplication.run(UppApplication.class, args);
    }


    @RequestMapping("/")
    String index()
    {
        return "Hello 华润万家统一流程平台";
    }
}
