package com.proyecto.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/public")
public class PublicController {
    
    @GetMapping("/index")
    public String index () {
        return "logout";
    }
    
}
