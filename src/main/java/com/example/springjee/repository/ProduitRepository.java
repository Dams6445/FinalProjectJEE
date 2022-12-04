package com.example.springjee.repository;

import com.example.springjee.entities.Categorie;
import com.example.springjee.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

    @Query(" SELECT p FROM  Produit p WHERE p.nom LIKE :nomProduit ")
    Produit findProduitByNom(@Param("nomProduit") String nomProduit);

    @Query(" SELECT p FROM  Produit p WHERE  p.reference LIKE  :referenceProduit ")
    Produit findProduitByReference(@Param("referenceProduit") String referenceProduit);

    @Query(" SELECT p FROM Produit p WHERE p.categorie.categorie_id = :idCategorie")
    List<Produit> findProduitByCategorie(@Param("idCategorie")Integer idCategorie);
}
