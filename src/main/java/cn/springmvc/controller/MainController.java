package cn.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	public UserService service;
	
	@RequestMapping("index.html")
	public void index(){
		
		for(User user:service.selectAll()){
			System.out.println("==============================");
			System.out.println(user.getName());
			System.out.println(user.getAge());
			System.out.println("==============================");
		}
	}
	
}
