package com.example.springjee.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AboutController {

    public String displayHome(){
        return "about";
    }
}
