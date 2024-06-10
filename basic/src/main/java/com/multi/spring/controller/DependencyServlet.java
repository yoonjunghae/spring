package com.multi.spring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.multi.spring.model.dto.Singer;
import com.multi.spring.model.dto.SingerMgt;

/**
 * Servlet implementation class DependencyServlet
 */
@WebServlet("/dependency")
public class DependencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DependencyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*IOC & DI :
		 *  개발자가 직접 new 하여 객체를 생성하던 방식에서 
		 *  개발자의 부담을 덜어주며, 보다 편하게 개발 가능하도록 스프링 자체에서
		 *   객체를 생성, 수정, 삭제 (소멸 ) 하도록 구현한 기술 	 */
		//3. 전략 디자인 패턴을 사용하여 결합도 낮추기 - 전달받은 값에따라 객체를 바꿔서 만들어 주는 방식 (이런구조의 beanFactory 를 스프링이 제공 )
		
				/*Singer singer = (Singer) BeanFactory.getBean(request.getParameter("bean"));
				singer.sing();
				singer.compose();
				singer.dance();*/
		//4. 스프링 컨테이너를 사용한 객체 생성하기 (xml)- xml 문서를 읽어  객체에 대한 결합도 를 xml 파일에 양도 ,개발자가 더이상 new로 객체 생성할 필요가 없다.
		//										따라서 개발자 중심의 코드가아닌 스프링 프레임워크 중심의 제어 반전,역행(IOC)을 구현
	AbstractApplicationContext cntx = new GenericXmlApplicationContext("/sample-context.xml");
		
		Singer singer = (cntx.getBean("singerMgt",SingerMgt.class)).getSinger();//이름. 타입
										//id          class타입 
		singer.sing();
		singer.compose();
		singer.dance();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
