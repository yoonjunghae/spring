package com.multi.spring.a_resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //명시안하면? pokemonService  소문자 
public class PokemonService {

	
	//1. 필드주입 
//	@Resource(name = "charmander")
//	private Pokemon pokemon;
//	
//	
//	
//	public void pokemonAttack() {
//		pokemon.attack();
//	}
	
	
	// 2. 생성자 주입 - 에러남 
//	private Pokemon pokemon;
//	 
//	@Resource(name = "charmander")
//	public PokemonService(Pokemon pokemon) {
//
//		this.pokemon = pokemon;
//	}
	
	
	//3. 메소드주입(setter 주입)
	private Pokemon pokemon;

	@Resource//(name = "charmander") //두개 같이 쓰는거 권장하지 않음! 
	@Qualifier("squirtle")
	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public void pokemonAttack() {
		pokemon.attack();
	}

	

}
