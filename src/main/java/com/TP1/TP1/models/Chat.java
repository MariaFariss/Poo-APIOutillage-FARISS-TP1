package com.TP1.TP1.models;

public class Chat extends Animal{
	public Chat(String nomAnimal, TypeAnimal typeAnimal) {
		super(nomAnimal, typeAnimal);
	}

	public String getNomAnimal() {
		return "le nom du chat est :" + nomAnimal;
	}
}
