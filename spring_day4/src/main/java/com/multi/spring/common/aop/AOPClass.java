package com.multi.spring.common.aop;
//@Component
//@Aspect //servlet-comtext에 xml로 설정 
public class AOPClass {
	

	public void login() { //공통적으로 수행할 메서드 정의
		System.out.println("$$$$$$$$$$$로그인 기능 추가됨$$$$$$$$$$$");
	}

	public void logout() {
		System.out.println("$$$$$$$$$$$로그아웃 기능 추가됨$$$$$$$$$$$");
	}

}
