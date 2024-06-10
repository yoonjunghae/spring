package com.multi.spring.board.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.board.model.dao.BoardDAO;
import com.multi.spring.board.model.dto.BoardDTO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {

	private final BoardDAO boardDAO;

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public BoardServiceImpl(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}
	
	
	//글 쓰기
	@Override
	public void insertBoard(BoardDTO boardDTO) throws Exception {
		int result = boardDAO.insertBoard(sqlSession, boardDTO);
		if (result < 0) {
			throw new Exception("게시글 등록에 실패했습니다.");
		}
	}
	
	//글 삭제
	@Override
	public void deleteBoard(int no) throws Exception {
		int result = boardDAO.deleteBoard(sqlSession, no);
		if (result < 0) {
			throw new Exception("게시글 삭제에 실패했습니다.");
		}
	}
	
	//글 수정
	@Override
	public void updateBoard(BoardDTO boardDTO) throws Exception {
		int result = boardDAO.updateBoard(sqlSession, boardDTO);
		if (result < 0) {
			throw new Exception("게시글 수정에 실패했습니다.");
		}
	}
	
	//글 검색(상세페이지)
	@Override
	public BoardDTO selectBoard(int no) throws Exception {
		BoardDTO boardDTO = boardDAO.selectBoard(sqlSession, no);
		
		return boardDTO;
	}
	
	//글 전체목록
	@Override
	public ArrayList<BoardDTO> selectBoardList() throws Exception {
		ArrayList<BoardDTO> list = (ArrayList<BoardDTO>) boardDAO.selectBoardList(sqlSession);

		return list;
	}	

}
