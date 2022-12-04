package com.example.springjee.service;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
import com.example.springjee.entities.TypeProduit;
import com.example.springjee.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionService {

    @Autowired
    PromotionRepository promotionRepository;

    public void addPromotion(Promotion promotion){
        promotionRepository.save(new Promotion(promotion.getNom(), promotion.getReduction(), promotion.getProduit()));
    }

    public void deletePromotionByNom(String nom) { promotionRepository.delete(promotionRepository.findPromotionByNom(nom));}

}
