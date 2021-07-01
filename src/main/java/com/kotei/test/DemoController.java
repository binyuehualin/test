package com.kotei.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sun.ming.kai
 * @Date 2021-06-25
 * @Description: TODO
 */
@RefreshScope
@RestController
@RequestMapping("/api/demo")
class DemoController{
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @GetMapping("/getValue")
    public String getValue(){
        System.out.println("你是好的");
        return "[username: " + username + ", password: " + password + "]";
    }
}