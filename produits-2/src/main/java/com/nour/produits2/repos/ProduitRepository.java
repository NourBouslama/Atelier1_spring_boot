package com.nour.produits2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nour.produits2.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
