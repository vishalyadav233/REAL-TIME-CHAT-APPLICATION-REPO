package com.Leap.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker

public class WsConfig implements WebSocketMessageBrokerConfigurer{
	
	
	@Override
	
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		
	 registry.addEndpoint("/javatechie").withSockJS();
		
	}
	
	

	public void configMessageBroker(MessageBrokerRegistry registry) {
		
		WebSocketMessageBrokerConfigurer.super.configureMessageBroker(registry);
		
		registry.enableSimpleBroker("/topic");
		registry.setApplicationDestinationPrefixes("/app");
	}

}
