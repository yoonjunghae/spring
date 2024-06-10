package com.multi.spring.board.service;

import java.util.ArrayList;

import com.multi.spring.board.model.dto.BoardDTO;

public interface BoardService {

	//글 쓰기
	void insertBoard(BoardDTO boardDTO) throws Exception;

	//글 삭제
	void deleteBoard(int no) throws Exception;
	
	//글 수정
	void updateBoard(BoardDTO boardDTO) throws Exception;
	
	//글 검색(상세페이지)
	BoardDTO selectBoard(int no) throws Exception;
	
	//글 전체목록
	ArrayList<BoardDTO> selectBoardList() throws Exception;	

}
