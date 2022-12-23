package com.example.springjee.repository;

import com.example.springjee.entities.Produit;
import com.example.springjee.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

    @Query(" SELECT p FROM Promotion p WHERE p.nom LIKE :nomPromotion ")
    Promotion findPromotionByNom(@Param("nomPromotion") String nomPromotion);

    @Query(" SELECT p FROM  Promotion p WHERE p.reduction = :prixPromotion ")
    List<Promotion> findPromotionByPrix(@Param("prixPromotion") Float prixPromotion);

    @Query (" SELECT p FROM  Promotion p WHERE  p.produit.categorie.id = :idCategorie")
    List<Promotion> findPromotionByCategorie(@Param("idCategorie") Integer idCategorie);

    @Query (" SELECT p FROM Promotion p WHERE p.produit.id = :idProduit")
    List<Promotion> findPromotionByProduit(@Param("idProduit") Integer idProduit);
}
