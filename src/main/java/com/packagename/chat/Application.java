package com.packagename.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Flux;
import reactor.core.publisher.UnicastProcessor;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    
    
    //MAIN METHOD
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	// UNICAST FOR PUSHING ALL THE MESSAGES
	@Bean
	UnicastProcessor<ChatMessage> publisher() {
		return UnicastProcessor.create();
	}

        
        
	// LAST 30 MESSAGES SEEN IF THE USER JOINS THE CONVERSATION LATE .
	// autoConnect()  IS USED HERE 
	@Bean
	Flux<ChatMessage> messages(UnicastProcessor<ChatMessage> publisher) {
		return publisher.replay(30).autoConnect();
	}
}
