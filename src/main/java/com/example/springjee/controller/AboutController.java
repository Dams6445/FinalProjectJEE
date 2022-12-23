package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AboutController {
    @Autowired
    CategorieService categorieService;

    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @RequestMapping("/about")
    public String displayHome(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "about";
    }
}
