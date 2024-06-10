package com.multi.spring.b_message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.multi.spring.b_message.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		String[] beanNames = context.getBeanDefinitionNames();
		for(String beanName : beanNames) {
			System.out.println("beanName : " + beanName);
		}
		
		
		Product carpBread = context.getBean("carpBread", Bread.class);
		System.out.println("carpBread: " + carpBread);
		
		Product milk = context.getBean("milk", Beverage.class);
		System.out.println("milk: " + milk);
		
		Product water = context.getBean("water", Beverage.class);
		
		ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
		cart1.addItem(carpBread);
		cart1.addItem(milk);
		
		System.out.println("cart1에 담긴 내용 : " + cart1.getItem());
		
		ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
		cart2.addItem(water);
		
		System.out.println("cart1에 담긴 내용 : " + cart2.getItem());
		
		System.out.println("cart1의 hashcode : " + cart1.hashCode());
		System.out.println("cart2의 hashcode : " + cart2.hashCode());

	}

}
