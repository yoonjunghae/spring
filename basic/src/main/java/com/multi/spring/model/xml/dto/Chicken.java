package com.multi.spring.model.xml.dto;

public class Chicken implements Food {

	@Override
	public void eat(String foodName) {
		System.out.println("한강에서 "+foodName + "치킨을 먹는중 ~~" );

	}

}
