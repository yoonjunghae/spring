package com.multi.section02.mapperscan.model.service;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;

import com.multi.section02.mapperscan.model.dto.ProductDTO;

public interface ProductService {

	List<ProductDTO> selectProductList();

	

}
