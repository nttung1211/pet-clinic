package me.clark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
	
	@RequestMapping("/vets")
	public String index() {
		return "vets/index";
	}
}
