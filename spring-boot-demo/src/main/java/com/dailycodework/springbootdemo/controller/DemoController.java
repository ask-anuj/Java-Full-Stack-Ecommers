package com.dailycodework.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Saying hello from DemoController";
    }
}
