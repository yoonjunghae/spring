package com.multi.spring.file.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.spring.file.model.dao.FileDao;
import com.multi.spring.movie.model.dto.MovieDTO;
@Service
public class FileServiceImpl implements FileService {
	
	@Autowired
	private FileDao fileDAO;
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void insertMovie(MovieDTO movieDTO) throws Exception{
		int result = fileDAO.insertMovie(sqlSession, movieDTO);
		
		if(result < 0) {
			throw new Exception("등록 실패");
		}
		
	}
	

}
