package com.example.springjee.service;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
import com.example.springjee.entities.TypeProduit;
import com.example.springjee.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {

    @Autowired
    PromotionRepository promotionRepository;


    public List<Promotion> getAllPromotions() { return promotionRepository.findAll();}

    public Promotion getPromotionByNom(String nom) { return  promotionRepository.findPromotionByNom(nom);}

    public List<Promotion> getPromotionByPrix(Float prix) { return  promotionRepository.findPromotionByPrix(prix);}

    public void addPromotion(Promotion promotion){ promotionRepository.save(new Promotion(promotion.getNom(), promotion.getReduction(), promotion.getProduit())); }

    public void deletePromotionByNom(String nom) { promotionRepository.delete(promotionRepository.findPromotionByNom(nom));}

    public List<Promotion> getPromotionByCategoie(Integer idCategorie) { return promotionRepository.findPromotionByCategorie(idCategorie);}

    public void deletePromotion( String nom ) { promotionRepository.delete(promotionRepository.findPromotionByNom(nom));}

}
