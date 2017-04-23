package tao.contierspringmvc.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@RequestMapping(value="/")
	public String test() throws IOException{
		return "home";
	}
}
