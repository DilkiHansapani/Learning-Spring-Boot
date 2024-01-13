package com.in28minutes.rest.webservices.restfulwebservices06.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHelloController {

    //@RequestMapping(method = RequestMethod.GET ,path = "/say-hello") or
    @GetMapping(path="/say-hello")
    public String helloWorld(){
        return "hello";
    }

    @GetMapping(path="/say-hello-bean")
    public HelloWorldBean helloBean(){
        return new HelloWorldBean("hello bean");
    }
}
