package com.ritika.SpringSecEx;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Welcome to Home!";
    }

    @GetMapping("/id")
    public String sessionId(HttpServletRequest request) {
        //to print session id, verify by inspect->network->localhost->cookies->session id
        return "SessionId:"+request.getSession().getId();
    }
}
// Spring security dependency in pom.xml file provide you inbuilt login form
//with spring generated paasword in console on running the application
//        also maintains the session on web browser
//if you want to change your password you can set it in application.properties
// if you want to logout hit: localhost:8080/logout