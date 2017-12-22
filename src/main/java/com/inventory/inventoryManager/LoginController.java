package com.inventory.inventoryManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inventory.inventoryManager.bean.User;


@Controller
public class LoginController {
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String generateVRP(@RequestBody User jsonInput)  {
		String message="";
		if(jsonInput.getUsername()=="demo"&& jsonInput.getPassword()=="pwd1234")
			message="success";
		else 
			message="failure";
		return message;
	}
	}

