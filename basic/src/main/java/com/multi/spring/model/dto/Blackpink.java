package com.multi.spring.model.dto;

public class Blackpink implements Singer{
	public Blackpink() {
		// TODO Auto-generated constructor stub
	}
	
	public void sing() {
		System.out.println("노래부르는 제니 ");
	}
	
	public void compose() {
		System.out.println("작곡하는 제니 ");
	}

	@Override
	public void dance() {
		System.out.println("춤추는 제니 ");
		
	}
}
