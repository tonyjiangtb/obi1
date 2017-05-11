package com.cdk.obi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.obi.model.Company;
import com.cdk.obi.model.Permission;
import com.cdk.obi.model.Server;
import com.cdk.obi.model.User;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

	AdminController() {
		System.out.println("AdminController Created");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User test2(@RequestParam(defaultValue = "lala") String id) {
		User u1 = new User();
		u1.UserID = id;
		u1.pass = "pass\"word";
		return u1;
	}

	@RequestMapping(value = "/servers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Server> getServer(@RequestParam(defaultValue = "all") String id) {
		ArrayList<Server> list = new ArrayList<Server>();
		if ("all".equals(id)) {
			Server server = new Server();
			server.ID = "CT01";
			server.desc = "Stage DMS Server";
			server.status = "140ms";
			server.wsdl = "http://192.168.0.1";
			list.add(server);
			
			Server server2 = new Server();
			server2.ID = "CT02";
			server2.desc = "Stage DMS Server";
			server2.status = "Offline";
			server2.wsdl = "http://192.168.0.2";
			list.add(server2);
		}
		return list;
	}
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Permission> getUser(@RequestParam(defaultValue = "all") String id) {
		ArrayList<Permission> list = new ArrayList<Permission>();
		if ("all".equals(id)) {
			Permission user = new Permission();
			user.UserID = "DOS01";
			user.Company = "A1";
			user.Interface = "GetOrder";
			
			list.add(user);
			Permission user2 = new Permission();
			user2.UserID = "DOS01";
			user2.Company = "A1";
			user2.Interface = "GetWIP";
			
			list.add(user2);
		}
		return list;
	}
	@RequestMapping(value = "/company", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Company> getCompany(@RequestParam(defaultValue = "all") String id) {
		ArrayList<Company> list = new ArrayList<Company>();
		if ("all".equals(id)) {
			Company comp = new Company();
			comp.MBcode = "XY001002";
			comp.ALcode = "AN";
			comp.description = "Beijing Dealer";
			comp.InstanceID = "CT01";
			list.add(comp);
			
			Company comp2 = new Company();
			comp2.MBcode = "XY001002";
			comp2.ALcode = "AB";
			comp2.description = "Guangzhou Dealer";
			comp2.InstanceID = "CT02";
			list.add(comp2);
		}
		return list;
	}
}
