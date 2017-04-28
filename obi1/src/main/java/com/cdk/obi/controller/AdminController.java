package com.cdk.obi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.obi.model.Server;
import com.cdk.obi.model.User;


@RestController
public class AdminController {

	@RequestMapping(value="/admin",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public User test2(@RequestParam(defaultValue="lala") String id){
		User u1=new User();
		u1.UserID=id;
		u1.pass="pass\"word";
		return u1;
	}
	@RequestMapping(value="/admin/servers",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Server> test3(@RequestParam(defaultValue="lala") String id){
		ArrayList<Server> list=new ArrayList<Server>();
		Server server=new Server();
		server.ID=id;
		server.status="pass\"word";
		list.add(server);
		return list;
	}
}
