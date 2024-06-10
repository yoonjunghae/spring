package com.multi.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public interface ProductService {

	List<ProductDTO> selectProductList();

	List<ProductDTO> selectProductList(SqlSessionTemplate sqlSession);

}
