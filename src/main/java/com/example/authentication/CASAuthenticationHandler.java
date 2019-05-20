package com.example.authentication;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.RulesDAO;

public class CASAuthenticationHandler implements AuthenticationHandler {

	@Autowired
	private RulesDAO dao;
	
	public boolean isAuthorized() {
		System.out.println("CASAuthenticationHandler isAuthorized");
		System.out.println(dao.query(""));
		return false;
	}

}
