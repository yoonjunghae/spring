package com.multi.spring.model.dto;

public class BeanFactory {/* 개발자가 원하는 객체를 선택해서 생성하기위한 전용 객체 */
	
	public static Object getBean(String name) {
		Singer singer= null;
		
		if(name.equals("twice")){
			singer = new Twice();
		}else {
			singer = new Blackpink();
		}
		
		return singer;
	}

}
