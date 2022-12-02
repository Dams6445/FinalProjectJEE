package com.example.springjee.service;

import com.example.springjee.dao.CategorieRepository;
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

    public void addCategorie(String nom){
        categorieRepository.save(new Categorie(nom,null));
    }

    public Optional<Categorie> getCategorieById(Integer id){
        return categorieRepository.findById(id);
    }
}
