package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.authentication.AuthenticationHandler;

@Component
public class DQService {
	@Autowired
	AuthenticationHandler authenticationHandler;
	
	public String getRules() {
		if(!authenticationHandler.isAuthorized()) {
			return "Not Authorized";
		}
		return "rules";
	}
}
