package com.multi.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;

public interface ProductDAO {

	List<ProductDTO> selectProductList(SqlSessionTemplate sqlSession);
	

}
