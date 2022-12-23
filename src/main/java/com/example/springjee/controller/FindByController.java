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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FindByController {

    @Autowired
    ProduitService produitService;

    @Autowired
    CategorieService categorieService;

    @Autowired
    PromotionService promotionService;


    @ModelAttribute("produitByCategorie")
    public Categorie produitByCategorie() {
        return new Categorie();
    }

    @ModelAttribute("promotionByCategorie")
    public Categorie promotionsByCategorie() {
        return new Categorie();
    }

    @ModelAttribute("categorie")
    public Categorie Categorie() {
        return new Categorie();
    }


    @RequestMapping("/rechercherPar")
    public String displayPrint(Model model) {
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        return "rechercherPar";
    }


    @PostMapping("/rechercherProduitParCategorie")
    public String displayProduitByCategorie(@ModelAttribute Categorie categorie, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        List<Produit> produits = produitService.getProduitByCategorie(categorieService.getCategorieByNom(categorie.getNom()).getId());
        model.addAttribute("produitsByCategorie", produits);
        return "rechercherPar";
    }

    @PostMapping("/rechercherPromotionParCategorie")
    public String displayPromotionByCategorie(@ModelAttribute Categorie categorie, Model model){
        List<Categorie> categories = categorieService.getAllCategories();
        model.addAttribute("categories", categories);
        List<Promotion> promotions = promotionService.getPromotionByCategoie(categorieService.getCategorieByNom(categorie.getNom()).getId());
        model.addAttribute("promotionsByCategorie", promotions);
        return "rechercherPar";
    }

}
