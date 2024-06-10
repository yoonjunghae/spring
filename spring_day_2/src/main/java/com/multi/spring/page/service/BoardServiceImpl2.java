package com.multi.spring.page.service;



import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.page.model.dao.BoardDAO2;
import com.multi.spring.page.model.dto.BoardDTO;
import com.multi.spring.page.model.dto.PageDTO;

@Service
public class BoardServiceImpl2 implements BoardService2 {
	
	@Autowired
	BoardDAO2 boardDAO;
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public List<BoardDTO> selectAll(PageDTO pageDto) {
		return boardDAO.selectAll(sqlSession, pageDto);
	}
	@Override
	public int selectCount() {
		return boardDAO.selectCount(sqlSession);
	}
	

}
