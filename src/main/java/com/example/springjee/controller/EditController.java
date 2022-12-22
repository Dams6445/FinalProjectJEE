package com.example.springjee.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditController {

    @RequestMapping("/editProduit")
    public String displayHome(){
        return "editProduit";
    }

}
