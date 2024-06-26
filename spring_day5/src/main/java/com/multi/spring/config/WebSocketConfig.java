package com.multi.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration //설정파일
@EnableWebSocketMessageBroker //@EnableWebSocketMessageBroker는 스프링 애플리케이션에서 웹 소켓 메시지 처리를 활성화하는 어노테이션 
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	//채팅방 이름 설정
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic"); //구독접두어 
		config.setApplicationDestinationPrefixes("/app"); 
	}
	
	//채팅 내용을 보낼 주소(endPoint == url)
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		//chat: 실시간 채팅용 
		registry.addEndpoint("/chat"); //자바 소켓 통신 가능 
		registry.addEndpoint("/chat").withSockJS(); //자바 스크립트 소켓 통신 
		
		//chat2: 챗봇용 
		registry.addEndpoint("/chat2"); //자바 소켓 통신 가능 
		registry.addEndpoint("/chat2").withSockJS(); //자바 스크립트 소켓 통신 
	}

}
