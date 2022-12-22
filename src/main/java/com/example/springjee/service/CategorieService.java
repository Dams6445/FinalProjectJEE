package com.example.springjee.service;

import com.example.springjee.repository.CategorieRepository;
import com.example.springjee.entities.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    public List<Categorie> getAllCategories(){
        return categorieRepository.findAll();
    }

    public void addCategorie(Categorie categorie){
        categorieRepository.save(new Categorie(categorie.getNom(),categorie.getImage()));
    }

    public void deleteCategorieByNom(String nom) { categorieRepository.delete(categorieRepository.findCategorieByNom(nom));}

    public void  deleteCategorie(Categorie categorie) { categorieRepository.delete(categorie);}

    public Optional<Categorie> getCategorieById(Integer id){
        return categorieRepository.findById(id);
    }

    public Categorie getCategorieByNom(String nom) { return categorieRepository.findCategorieByNom(nom);}

    public void updateCategorie(Categorie categorie){
        Categorie categorieFromDB = categorieRepository.findById(categorie.getId())
                .orElse(new Categorie(categorie.getNom(), null));
        categorieFromDB.setNom(categorie.getNom());
        categorieFromDB.setImage(categorie.getImage());
        categorieRepository.save(categorieFromDB);
    }

}
