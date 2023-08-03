package com.dharun.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringApplication {

    @GetMapping("/hello")
    public ModelAndView hello(){
        System.out.println("hello getmapping");
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message","Dharanish");
        return model;
    }

}
