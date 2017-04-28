package com.cdk.obi.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("service1")
@Scope("request")
public class Service1 {

	public Service1(){
		System.out.println("Service1 Created");
	}
	public void hello(){
		System.out.println("Service1 hello");
	}
}
