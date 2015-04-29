package com.lenoblgis.sergey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class GoodbuyController {

	
	@RequestMapping(value = "/goodbuy", method = RequestMethod.GET)
	public String home( Model model) {

		
		
		//model.addAttribute("serverTime", formattedDate );
		
		return "goodbuy";
	}
	
}
