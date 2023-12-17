package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//endpoint
@RestController //@RestController annotation combines @Controller and
// @ResponseBody, indicating that the return values of methods should be directly written to the HTTP response body.
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration") //This annotation maps the method to the specified URL path ("/currency-configuration")
    public CurrencyServiceConfiguration retrieveAllCourse(){
        return configuration;

    }
}
