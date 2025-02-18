package com.ritika.simpleWebApp;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        System.out.println("i'm here");
        return "Welcome!!!";
    }
}
