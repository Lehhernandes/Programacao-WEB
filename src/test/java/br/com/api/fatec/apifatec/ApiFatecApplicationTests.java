package br.com.api.fatec.apifatec;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootTest
class ApiFatecApplicationTests {
	@RequestMapping("/idade/{num}")
	int idade (@PathVariable int num) {
		if (num<12){
			System.out.println("Criança");
		}
		if (num<=18){
			System.out.println("Adolescente");
		}
		if (num<60){
			System.out.println("Adulto");
		}
		if (num>60) {
			System.out.println("Idoso");
		}
		else {
			System.out.println("Idade Inválida");
		}
		return num;
	}

	@Test
	void contextLoads() {
	}

}
