package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @Autowired
    private AuthenticationService authenticationService;

//    public LoginController(AuthenticationService authenticationService) {
//        this.authenticationService = authenticationService;
//    }

    @RequestMapping(value = "login", method = {RequestMethod.GET})
    public String tryToLog(){
        return "login";
    }

    @RequestMapping(value = "login", method = {RequestMethod.POST})
    public String welcome(@RequestParam String name, @RequestParam String pwd, ModelMap model){

        if (authenticationService.authenticate(name,pwd)){
            model.put("name",name);
            model.put("pwd",pwd);

            return "welcome";
        }
        return "login";
    }
}
