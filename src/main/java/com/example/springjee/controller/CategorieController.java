package com.example.springjee.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategorieController {

    @RequestMapping("/categorie")
    public String displayHome() {
        return "categorie";
    }
}
