package com.multi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RestController :  RestController 어노테이션을 사용하면 @ResponseBody 를 일일이 선언 안해도 되게 지원해준다. 
//restController 차체가 controller  + @ResponseBody  ->ajax수업때 진행, springboot보강시
/*클래스 레벨에 url 공통부분 설정하면 url의 중복되는 부분은 작성하지 않아도됨! */
@RequestMapping("/order")  //("/order/**") 모든하위 경로 다 받겠다는 뜻! 
public class ClassMappingController {
	
	@GetMapping("/regist")
	public void registOrder(Model model) {
		model.addAttribute("message","주문등록");
			//return이 없어도 되는 이유 : 뿌려줄 화면이 view파일에 있는 경로와 똑같으면 
	}
	@RequestMapping(value= {"modify", "delete"}, method = RequestMethod.POST)
	public String modifyAndDelete(Model model) {
		
		model.addAttribute("message", "POST 방식의 주문 정보 수정과 주문 정보 삭제 공통 처리용 핸들러 메소드 호출함...");
		
		return "mappingResult";
	}
	
	@GetMapping("detail/{orderNo}")
	public String selectOrderDetail(Model model, @PathVariable("orderNo") int orderNo) {
		model.addAttribute("message", orderNo + "번 주문 상세 내용 조회용 핸들러 메소드 호출함...");
		
		return "mappingResult";
	}

}
