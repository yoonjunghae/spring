package com.multi.spring.c_locale.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class ContextConfiguration {
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		
		/*  접속하는(즉 요청하는) 세션의 로케일정보에 따라 properties를 자동 재로딩하는 용도의 MessageSource 구현체 
		 * MessageSource는 키밸류 형태로 저장하고 있다가 키값으로 뽑아 와서  사용 할수 있게 제공 */
		ReloadableResourceBundleMessageSource messageSource = 
				new ReloadableResourceBundleMessageSource();
		
		/* 다국어메세지를 읽어올 properties 파일의 기본 파일 이름을 설정한다. 
		 * 로케일이 존재하지 않는 경우 해당 파일을 읽어들인다.
		 * */
		messageSource.setBasename("message");// 접두사 이름 으로 읽어들인다 
		/* 불러온 메세지를 해당 시간 동안 캐싱한다. */
		messageSource.setCacheSeconds(10);
		/* 기본 인코딩 셋을 설정할 수 있다. */
		messageSource.setDefaultEncoding("UTF-8");
		
		
		return messageSource;
	}
	
}
