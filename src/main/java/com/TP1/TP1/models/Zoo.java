package com.TP1.TP1.models;
import java.util.ArrayList;
import java.util.List;

import com.TP1.TP1.exception.LimiteVisiteurException;

public class Zoo {
	
	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	private int NB_VISITEUR_MAX_PAR_SECTEUR = 10 ;
	
	
	public Zoo(int visiteurs) {
		this.visiteurs = visiteurs;
		this.secteursAnimaux = new ArrayList<>();
	}
	
	public void ajouterSecteur( TypeAnimal animal) {
		
		secteursAnimaux.add(new Secteur(animal));
	}
	
	
	public Secteur getSecteur( TypeAnimal animal) {
		Secteur secteur= null;
		for(Secteur s: secteursAnimaux) {
	        if(s.obtenirType() == animal) {
	            secteur = s;
	        }
	        
		}
		return secteur ;
	}
	
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		if(visiteurs > NB_VISITEUR_MAX_PAR_SECTEUR) throw new LimiteVisiteurException("Erreur!! le nombre de visiteurs a depasse la capacite maximale");
		visiteurs++;
	}
	
	public int getLimiteVisiteur() {
		return NB_VISITEUR_MAX_PAR_SECTEUR ;
	}
	
	public  void nouvelAnimal(Animal animal) {
		
		for(Secteur s: secteursAnimaux) {
			if(animal.getTypeAnimal() == s.obtenirType()) {
				s.ajouterAnimal(animal);
			}
			
		}
		
	}
	
	public int getVisiteurs() {
		return visiteurs;
	}

	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}

	public int nombreAnimaux() {
		int somme=0;
		for(Secteur secteur: secteursAnimaux) {
			somme = somme + secteur.getNombreAnimaux();
			
		}
		return somme;
		
	}
	
	
	

}
