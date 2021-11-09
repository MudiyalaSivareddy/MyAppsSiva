package com.mkyong.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.entity.Emp;
import com.mkyong.service.EmpService;

@Controller
public class MainController {
	
	@Autowired
	private EmpService service;
	@GetMapping("/")
	public String showFrom( Model m) {
		 m.addAttribute("emp", new Emp());  
		return "Register";
		
	}
	@PostMapping("/")
	public String showFromValidation(@Valid @ModelAttribute("emp") Emp e, Errors errors) {
		
		if(errors.hasErrors()) {
			return "Register";
			
		}else {	
			
		return "Login";
		}
	}

}
