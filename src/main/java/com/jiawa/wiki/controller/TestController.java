package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author yuu
 **/
@RestController
public class TestController {

    @Value("${config.info:imooc}")
    String info;

    @PostMapping("/hello")
    public String hello(){
        return "hello"+info;
    }
}
