package com.example.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.SpringConfig;
import com.example.service.DQService;

public class Main {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)){
			DQService dqService = context.getBean(DQService.class);
			String rules = dqService.getRules();
			System.out.println(rules);
		}
	}

}
