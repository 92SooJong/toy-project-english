package com.soojong.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private RedisTemplate<String, String> template;

    @GetMapping("/sample")
    public String getSample() {

        Integer append = template.opsForValue().append("ha", "soo jong");
        System.out.println(append);

        return null;
    }


}
