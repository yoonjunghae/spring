package com.multi.section02.mapperscan.model.service;

import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.multi.section02.mapperscan.model.dao.ProductDAO;
import com.multi.section02.mapperscan.model.dto.ProductDTO;

@Service("productService") //getBean을 통해서 이름으로 호출
public class ProductServiceImpl implements ProductService {
	
	private final ProductDAO productDAO;
	/*private final SqlSessionTemplate sqlSession;*/
	
	public ProductServiceImpl(ProductDAO productDAO ,SqlSessionTemplate sqlSession ) {
		
		this.productDAO = productDAO;
		/*this.sqlSession = sqlSession;*/
	}

	@Override
	public List<ProductDTO> selectProductList() {
		// TODO Auto-generated method stub
		return productDAO.selectProductList(/*sqlSession*/);
	}
	
	 /* 마이바티스 스캔을 사용하면 
		 * sqlsession 으로 부터 getMapper 로 ProductDAO.class 타입의 매퍼파일을 꺼내와서 매퍼객체의  selectProductList 결과로  리스트 형태로 반환 해준다
		 * MenuDAO 는 인터페이스고  구현체가 아니다. 그래서 의존주입시 @repository 가 정의된 빈이 없다. 그래서 에러발생. 인터페이스로는 빈을 생성할수 없다. 
		 * 마이바티스에서 만들어준 프록시 객체로 사용하고 있기때문에 
		 * 이 프록시 객체를 빈으로 생성 해야기때문에 별도 설정 해주어야한다. spring-context.xml(설정파일)에 추가 */



}
