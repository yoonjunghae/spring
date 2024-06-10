package com.multi.spring.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import ch.qos.logback.classic.Logger;

public class TestInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger=(Logger) LoggerFactory.getLogger(TestInterceptor.class);
	// 뷰에서 요청 -->filter--> DispatcherServlet -- 인터셉터 --> Controller --> Service --> Dao --> DB
	//								         <-- 인터셉터 --  Controller <-- Service <-- Dao <-- DB

	@Override // DispatcherServlet 에서 컨트롤러 호출하기 전에 수행
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("==================preHandle start ====================");
		logger.debug(request.getRequestURI());
		return super.preHandle(request, response, handler);
	}

	@Override // 컨트롤러에 DispatcherServlet 으로 리턴되는 순간에  수행
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		logger.debug("==================postHandle start ====================");
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override //최종 결과를 생성하는 일을 포함한 모든 작업이 완료된다음에 반환되기 전에 수행
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.debug("==================afterCompletion start ====================");
		super.afterCompletion(request, response, handler, ex);
	}
	
}
