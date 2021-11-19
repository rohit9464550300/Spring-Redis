package com.imc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView add(@RequestParam("user") String user,@RequestParam("password") String password, ModelAndView modelAndView){
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}
