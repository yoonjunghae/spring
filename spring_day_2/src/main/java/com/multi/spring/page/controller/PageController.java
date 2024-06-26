package com.multi.spring.page.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.spring.page.model.dto.BoardDTO;
import com.multi.spring.page.model.dto.PageDTO;
import com.multi.spring.page.service.BoardService2;

@Controller
@RequestMapping("/page")
public class PageController {
	@Autowired
	BoardService2 boardService;
	

	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@GetMapping("/bbsMain") // 화면전환
	public void pageMain() {

	}
	@GetMapping("bbsAll")
	public void selectAll(PageDTO pageDto, Model model) {
		
		pageDto.setStartEnd(pageDto.getPage());
		
		List<BoardDTO> list = boardService.selectAll(pageDto);
		int count = boardService.selectCount();
		
		int pages = count / 10 + 1; // 전체 페이지 개수 구하기
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	@GetMapping("bbsAll2")
	public void selectAll2(PageDTO pageDto, Model model) {
		
		pageDto.setStartEnd(pageDto.getPage());
		
		List<BoardDTO> list = boardService.selectAll(pageDto);
		int count = boardService.selectCount();
		
		int pages = count / 10 + 1; // 전체 페이지 개수 구하기
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	
	@GetMapping("bbslist2")
	public void selectbbslist2(PageDTO pageDto, Model model) {
		
		pageDto.setStartEnd(pageDto.getPage());
		
		List<BoardDTO> list = boardService.selectAll(pageDto);
		
		model.addAttribute("list", list);
		
	}
	


}