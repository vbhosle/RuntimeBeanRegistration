package com.example.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import com.example.authentication.AuthenticationHandler;

//@Component
public class CustomBeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("In beanpostprocessor");
		try {
			AuthenticationHandler authenticationHandler = (AuthenticationHandler) Class.forName("com.example.authentication.CASAuthenticationHandler").newInstance();
			beanFactory.registerSingleton("authenticationHandler", authenticationHandler);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
