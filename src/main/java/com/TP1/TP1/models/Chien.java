package com.TP1.TP1.models;

public class Chien extends Animal{
	public Chien(String nomAnimal, TypeAnimal typeAnimal) {
		super(nomAnimal, typeAnimal);
	}

	public String getNomAnimal() {
		return "le nom du chien est :" + nomAnimal;
	}
	
}
