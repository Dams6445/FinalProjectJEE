package com.example.springjee.repository;

import com.example.springjee.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

    @Query("SELECT c FROM Categorie c WHERE c.nom LIKE :nomCategorie")
    Categorie findCategorieByNom(@Param("nomCategorie") String nomCategorie);


}
