package com.example.springjee.service;

import com.example.springjee.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {

    @Autowired
    ProduitRepository produitRepository;
}
