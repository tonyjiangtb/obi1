package com.cdk.obi.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.obi.dao.DataMapper;
import com.cdk.obi.model.DBUser;
import com.cdk.obi.service.Service1;


@RestController
public class HomeController {

	//@Autowired
	//@Resource(name="servicex") //component 一定要制定实例名字
	//private Service1 service1;
	
	//private Service1 service2;
	
	//@Autowired
	//private SqlSessionFactory sql;
	
	//@Autowired
	//@Qualifier("service2")
	private void SetService(Service1 s){
		//指向了同一个名字
		//this.service2=s;
		//s.hello();
	}
	//@Autowired
	//private DataMapper db;
	
	@RequestMapping(value="/")
	public String test() throws IOException{
		//service1.hello();
		//sql.openSession().
		//List<DBUser> l= db.getAll();
		//l.size();
		return "home";
	}
	@RequestMapping(value="/test/{ifname}/{method}", headers="Accept=APPLICATION/JSON")
	public ResponseEntity<String> jsontest(RequestEntity<String> a,@PathVariable String ifname,@PathVariable String method ) throws IOException{
		//service1.hello();
		//sql.openSession().
		System.out.println(ifname+":"+method);
		System.out.println(a.toString());
		System.out.println(a.getBody());
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("\"name\":value",headers,HttpStatus.OK);
	}
}
