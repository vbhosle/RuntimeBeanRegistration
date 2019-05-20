package com.example.authentication;

public class JWTAuthenticationHandler implements AuthenticationHandler {

	public boolean isAuthorized() {
		System.out.println("JWTAuthenticationHandler isAuthorized");
		return false;
	}

}
