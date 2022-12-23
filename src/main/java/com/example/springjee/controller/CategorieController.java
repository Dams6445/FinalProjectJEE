package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;
import java.util.List;


@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @RequestMapping("/categories")
    public String afficherCategories(Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "categories";
    }

}
