package com.multi.spring.a_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("com.multi.spring.a_resource");

		
		PokemonService pokemonService = context.getBean("pokemonService", PokemonService.class);
		                                                       //Bean의 이름
		pokemonService.pokemonAttack();
	}

}
