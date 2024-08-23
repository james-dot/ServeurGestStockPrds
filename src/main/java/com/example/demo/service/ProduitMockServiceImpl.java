package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;

@Service
public class ProduitMockServiceImpl implements IProduitservice{
	private List<Produit> produits;
	
	public ProduitMockServiceImpl() {
	
		produits = new ArrayList<Produit>();
		produits.add(new Produit("livre", 50, 20));
		produits.add(new Produit("Cahier", 50, 55));
		produits.add(new Produit("Stylo", 500, 27) );
	
    }
	
	@Override
	public List<Produit> getProduit() {
		
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		produits.remove(produit);
	}

}
