package com.yuxia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuxia.entity.User;

@Controller
public class UserController {

	@RequestMapping(value="user",method=RequestMethod.POST)
	public void getUser(User user){
		System.out.println(user);
	}
	@RequestMapping(value="user",method=RequestMethod.GET)
	public String addUser(@ModelAttribute("user")User user){
		return "user";
	}
}