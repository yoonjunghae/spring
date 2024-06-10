package com.multi.spring.model.anno.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("선재")
	//@Value("값")을 넣어서 내부에서 xml 화 하여 값을 가지고 시작하게 만드는 어노테이션 
	//(xml에서 set 했던것과 같음) 단순 값 주입
	private String name;
	
//		@Autowired: 필드 타입을 기준으로 빈을 찾음
//	    @Autowired : 필드, 생성자, 입력파라미터가 여러개인 메소드(@Qualifier는 메소드의 파라미터)에 적용 가능
//
//	    @Resource: 필드 이름을 기준으로 빈을 찾음
//	    @Resource : 필드, 입력 파라미터가 한 개인 빈 프로퍼티 setter 메소드에 적용가능
	
	
	
	//@Autowired 스프링이 해당 타입의 객체를 찾아 할당, 빈객체를 자동주입, DI(의존성 주입)
	@Autowired // (required = false) 자동주입대상이 필수가 아닌경우에 작성 
	@Qualifier("pizza") // 자동주입할 하나의 인터페이스 타입의 빈이 2개 이상인경우 하나의 빈을 지정하는 어노테이션
	private Food myFood;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Food myFood) {
		super();
		this.name = name;
		this.myFood = myFood;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Food getMyFood() {
		return myFood;
	}

	public void setMyFood(Food myFood) {
		this.myFood = myFood;
	}

	@Override
	public String toString() {
		return name + "~~~" + myFood;
	}


	
	
}
