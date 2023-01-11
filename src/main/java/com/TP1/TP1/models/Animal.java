package com.TP1.TP1.models;

public class Animal {
	protected String nomAnimal;
	private TypeAnimal typeAnimal;

	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
	}

	public String getNomAnimal() {
		return nomAnimal;
	}
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}
}
