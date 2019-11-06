package com.tx.child2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {
	
	@Value("${server.port}")
	public String serverPort;
	
	public MyBean() {
		System.out.println("Construction Of child2");
	}
	
	@PostConstruct
	public void printProperties() {
		System.out.println("serverPort2 = " + serverPort);
	}

}
