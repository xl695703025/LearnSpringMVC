package com.yuxia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yuxia.entity.User;

@Controller
public class IndexController  {

	@RequestMapping("/index1")
	public String index1(
			@RequestParam(value = "userName", required = false) String userName) {
		System.out.println("hello," + userName);
		return "index";
	}

	@RequestMapping("/index2")
	public ModelAndView index2(
			@RequestParam(value = "userName", required = false) String userName) {
		System.out.println("hello," + userName);
		ModelAndView mView = new ModelAndView();
		mView.addObject("userName", userName);
		mView.setViewName("index");
		return mView;
	}

	@RequestMapping("/index3")
	public String index3(String userName, Model model) {
		System.out.println("hello," + userName);
		model.addAttribute("userName", userName);
		return "index";
	}

	@RequestMapping("/index4")
	public String index4(String userName, Model model) {
		System.out.println("hello," + userName);
		model.addAttribute("userName", userName);

		// 会以userName的类型为Key和userName的值为Value
		// 假设userName=admin
		// 即String：admin
		model.addAttribute(userName);
		return "index";
	}
	
	@RequestMapping("/index5")
	public String index5(String userName, Model model) {
		System.out.println("hello," + userName);
		model.addAttribute("userName", userName);
		model.addAttribute(userName);
		User user=new  User();
		user.setUserName(userName);
		model.addAttribute("currentUser", user);
		model.addAttribute(user);
		return "index";
	}
}
