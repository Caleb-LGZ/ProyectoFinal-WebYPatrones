package com.proyecto.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
    
    @RequestMapping(value={"/","/inicio"})
    public String inicio() {
        return "inicio";
    }
    
    @RequestMapping(value="/contacto")
    public String contacto () {
        return "contacto";
    }
    
    @RequestMapping(value="/preguntas")
    public String preguntas () {
        return "preguntas";
    }
    
    @RequestMapping(value="/nosotros")
    public String nosotros () {
        return "nosotros";
    }
    
    @RequestMapping(value="/cursos")
    public String cursos () {
        return "cursos";
    }
    
    @RequestMapping(value="/blog")
    public String blog () {
        return "blog";
    }
}
