package com.nour.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nour.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
