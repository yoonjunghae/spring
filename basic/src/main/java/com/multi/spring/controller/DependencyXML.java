package com.multi.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.multi.spring.model.xml.dto.Person;

/**
 * Servlet implementation class DependencyXML
 */
@WebServlet("/xmlDI")
public class DependencyXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DependencyXML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//객체의존성 : 객체를 생성할때 new 를통해서 생성하는것 뿐만아니라, 메소드를 사용하든 어떤방법으로든 객체의 정보를 전달받는것
		
		/*
		 1. 생성자를 통한 의존성 주입
		Person p = new Person("유재석", "건물주");
		
		2. setter 를 통한 의존성 주입
		p.setName("남주혁");
		
		3. 다른 메소드를 통한 의존성 주입
		Connection con = getConnection();
		
		*/
		
		AbstractApplicationContext cntx = new GenericXmlApplicationContext("/di-xml-context.xml");
		Person p1 = (Person) cntx.getBean("person1");
		p1.getMyFood().eat("푸라닭");
		
		Person p2 = (Person) cntx.getBean("person2");
		p2.getMyFood().eat("도미노");
		
		Person p3 = (Person) cntx.getBean("person1");
		p3.getMyFood().eat("bhc");
		
		Person p4 = (Person) cntx.getBean("person2");
		p4.getMyFood().eat("피자스쿨");
		
		//스프링에서 싱글톤패턴으로 객체를 관리한다.
		
		System.out.println("p1" + p1);
		System.out.println("p2" + p2);
		System.out.println("p3" + p3); //p1 == p3 같은사람
		System.out.println("p4" + p4);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
