package com.testExercise.ex.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")

public class FirstController {

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "/edit";
    }
}
