package com.example.springjee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class CategorieController {

    @GetMapping("/categories")
    public String displayHome() {
        return "categories";
    }
}
