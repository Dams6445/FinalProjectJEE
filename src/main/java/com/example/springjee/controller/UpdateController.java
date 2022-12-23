package com.example.springjee.controller;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
import com.example.springjee.service.CategorieService;
import com.example.springjee.service.ProduitService;
import com.example.springjee.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class UpdateController {

    @Autowired
    CategorieService categorieService;

    @Autowired
    ProduitService produitService;

    @Autowired
    PromotionService promotionService;

    @ModelAttribute("categorie")
    public Categorie categorie() {
        return new Categorie();
    }

    @ModelAttribute("produit")
    public Produit produit() {
        return new Produit();
    }

    @ModelAttribute("promotion")
    public Promotion promotion() {
        return new Promotion();
    }

    @RequestMapping("/update")
    public String update(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "update";
    }

    @RequestMapping("/editCategorie")
    public String afficherEditCategorie(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "editCategorie";
    }
    @RequestMapping("/editProduit")
    public String afficherEditProduit(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "editProduit";
    }
    @RequestMapping("/editPromotion")
    public String afficherEditPromotion(Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "editPromotion";
    }

    @RequestMapping("/updateCategorie")
    public String updateCategorie(@ModelAttribute Categorie categorie, Model modele) {
        List<Categorie> categories = categorieService.getAllCategories();
        modele.addAttribute("categories", categories);
        modele.addAttribute("categorie", categorie);
        categorieService.updateCategorie(categorie);
        return "editCategorie";
    }

    @RequestMapping("/updateProduit")
    public String updateProduit(@ModelAttribute Produit produit, @RequestParam(value = "imageProduit", required = false) String path, Model modele) throws IOException {
        List<Categorie> categories = categorieService.getAllCategories();
        modele.addAttribute("categories", categories);
        modele.addAttribute("produit", produit);
        produitService.updateProduit(produit);
        return "editProduit";
    }


    @RequestMapping("/updatePromotion")
    public String updatePromotion(@ModelAttribute Promotion promotion, Model modele) {
        List<Categorie> categories = categorieService.getAllCategories();
        modele.addAttribute("categories", categories);
        modele.addAttribute("promotion", promotion);
        promotionService.updatePromotion(promotion);
        return "editPromotion";
    }
}
