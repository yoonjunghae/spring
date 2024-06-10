package com.multi.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service("productService") //getBean을 통해서 이름으로 호출
public class ProductServiceImpl implements ProductService {
	
	private final ProductDAO productDAO; // 값이 바뀌는걸 방지하기위해 final로 선언? 
	private final SqlSessionTemplate sqlSession;
	
	public ProductServiceImpl(ProductDAO productDAO ,SqlSessionTemplate sqlSession ) {
		
		this.productDAO = productDAO;
		this.sqlSession = sqlSession;
	}

	@Override
	public List<ProductDTO> selectProductList() {
		// TODO Auto-generated method stub
		return productDAO.selectProductList(sqlSession);
	}

	@Override
	public List<ProductDTO> selectProductList(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated method stub
		return null;
	}

}
