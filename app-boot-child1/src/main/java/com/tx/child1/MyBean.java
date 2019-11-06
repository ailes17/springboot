package com.tx.child1;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Value("${server.port}")
	public String serverPort;
	
	public MyBean() {
		System.out.println("Construction Of child1");
	}
	
	@PostConstruct
	public void printProperties() {
		System.out.println("serverPort1 = " + serverPort);
	}
}
