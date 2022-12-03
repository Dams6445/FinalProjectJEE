package com.example.springjee.repository;

import com.example.springjee.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    @Query(" SELECT p FROM  Produit p WHERE p.nom LIKE :nomProduit")
    Produit findProduitByNom(@Param("nomProduit") String nomProduit);

}
