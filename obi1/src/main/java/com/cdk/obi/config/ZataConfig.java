package com.cdk.obi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cdk.obi.service.Service1;

@Configuration
public class ZataConfig {
	
	ZataConfig(){
		System.out.println("zataConfig Created");
	}
	@Bean//用方法名指定bean id
	Service1 service2(){
		return new Service1();
	}
}
