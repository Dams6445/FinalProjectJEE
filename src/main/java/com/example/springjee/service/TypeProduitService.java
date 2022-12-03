package com.example.springjee.service;

import com.example.springjee.repository.TypeProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TypeProduitService {

    @Autowired
    TypeProduitRepository typeProduitRepository;

}
