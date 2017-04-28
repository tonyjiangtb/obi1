package com.cdk.obi.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.obi.service.Service1;


@RestController
public class HomeController {

	//@Autowired
	@Resource //component 一定要制定实例名字
	private Service1 service1;
	
	private Service1 service2;
	
	@Autowired
	private Service1 service3;
	
	@Autowired
	//@Qualifier("service2")
	private void SetService(Service1 s){
		//指向了同一个名字
		this.service2=s;
		s.hello();
	}
	@RequestMapping(value="/")
	public String test() throws IOException{
		service1.hello();
		return "home";
	}
}
