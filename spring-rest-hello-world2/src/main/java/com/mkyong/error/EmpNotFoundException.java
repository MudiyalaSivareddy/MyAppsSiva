package com.mkyong.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class EmpNotFoundException extends Exception {
	
	@ExceptionHandler(value=EmpNotFoundException.class)
	public String EmpNotFoundException(Model model) {
		
		model.addAttribute("msg","Employeee details not avaible i DB");
		return "error";
	}
	

}
