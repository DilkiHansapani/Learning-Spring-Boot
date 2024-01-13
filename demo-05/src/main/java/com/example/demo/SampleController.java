package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
    @RequestMapping(value = "/sample" , method = RequestMethod.GET)
    public String getSample(ModelMap model){
        return "sample";
    }
}
