package com.jiawa.wiki.controller;


import com.jiawa.wiki.po.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author yuu
 **/
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @Value("${config.info:imooc}")
    String info;

    @PostMapping("/hello")
    public String hello(){
        return "hello\t"+info;
    }

    @GetMapping("/list")
    public List<Test> list(){
        return testService.list();
    }
}
