package com.inventory.inventoryManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inventory.inventoryManager.bean.User;


@Controller
public class LoginController {
	private final String pwd="pwd1234";
	private final String userName="demo";
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public  String generateVRP(@RequestBody User jsonInput)  {
		String message="";
		if(jsonInput.getUsername()==userName&& jsonInput.getPassword()==pwd)
			message="success";
		else 
			message="failure";
		return message;
	}

	}

