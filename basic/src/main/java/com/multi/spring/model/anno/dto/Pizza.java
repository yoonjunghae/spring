package com.multi.spring.model.anno.dto;

import org.springframework.stereotype.Component;

@Component
public class Pizza implements Food {

	@Override
	public void eat(String foodName) {
		System.out.println("집에서 "+ foodName + "피자를 먹는중 ~~~");

	}

}
