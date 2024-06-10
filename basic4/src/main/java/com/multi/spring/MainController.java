package com.multi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
//@RestController //json형식으로 값을 가져다줌 
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		
		return "main";
	}

}
