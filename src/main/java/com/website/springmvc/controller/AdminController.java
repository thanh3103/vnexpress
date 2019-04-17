package com.website.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Transactional
public class AdminController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminPage() {
		return "home";
	}
	
}
