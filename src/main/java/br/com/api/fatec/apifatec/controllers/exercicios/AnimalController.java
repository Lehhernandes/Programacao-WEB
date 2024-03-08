package br.com.api.fatec.apifatec.controllers.exercicios;

import java.util.List;

public class AnimalController {
	String[] types = {"cachorro", "gato", "vaca", "galinha"};	
	public String[] getAnimalSounds() {
		return types;
	}
	private String[] getSoundByAnimalType() {
		return types;
		
	}

}
