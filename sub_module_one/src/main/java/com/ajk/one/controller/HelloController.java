package com.ajk.one.controller;

import com.ajk.one.One;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hi")
    @ResponseBody
    public String sayHi(String name){
        One one = new One();
        String sayHi = one.sayHi(name);
        System.out.println("=====>"+sayHi);
        return "sayHi"+name+"====>"+sayHi;
    }

}
