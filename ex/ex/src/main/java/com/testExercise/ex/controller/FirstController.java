package com.testExercise.ex.controller;


import com.testExercise.ex.engine.ResponseChars;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/counts")

public class FirstController {

    @ResponseBody
    @RequestMapping("/{string}")
      public String sayHello(@ModelAttribute("string") String say){
        return ResponseChars.counts(say);
    }
}
