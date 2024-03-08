package br.com.api.fatec.apifatec.controllers.exercicios;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

public class AnimalController {
	String[] types = {"cachorro", "gato", "vaca", "galinha"};
	@RequestMapping("/animal/{nomes}")	
	public String[] getAnimalSounds() {
		for (int x=0; x<types.length;x++){
			int x =Integer.parseInt(types);
			if (types.get(x).getAnimalSounds.equalls{

			}	
		}
		return types;

	}
	private String[] getSoundByAnimalType() {
		return types;
		
	}

}
