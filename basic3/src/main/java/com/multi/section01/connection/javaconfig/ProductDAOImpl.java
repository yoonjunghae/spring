package com.multi.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository("productDAO") //db연결 
public class ProductDAOImpl implements ProductDAO {

	

	@Override
	public List<ProductDTO> selectProductList(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("productMapper.selectProductList");
	}



}
