package com.mkyong.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.entity.Emp;

import com.mkyong.error.EmpNotFoundException;
import com.mkyong.repository.EmpRepository;
import com.mkyong.service.EmpService;


@RestController
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@Autowired
	private EmpRepository repo;
	 
	@GetMapping("/allEmp")
	  public  List<Emp> findAll(Emp emp) {
	       return repo.findAll();
	         
	    }
	
	 @PostMapping("/saveEmp")
	 @ResponseStatus(HttpStatus.CREATED)
	Emp saveEmp(@RequestBody Emp emp) {
		 return service.saveEmp(emp);
			
	}
	 @GetMapping("/empId/{Eid}") 
	 public Optional<Emp> findEmpById(@PathVariable int Eid) throws EmpNotFoundException {
		return service.findById(Eid);
	
	 }


@GetMapping("/empName/{name}") 
public List<Emp> findEmpByName(@PathVariable String name){
	return service.findByName(name);
	//end of the code

}
	
}
