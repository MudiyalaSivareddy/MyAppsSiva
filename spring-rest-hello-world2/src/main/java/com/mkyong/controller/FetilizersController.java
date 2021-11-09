package com.mkyong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mkyong.entity.Emp;
import com.mkyong.entity.Fetilizers;
import com.mkyong.error.EmpNotFoundException;
import com.mkyong.repository.FetilizersRepository;
import com.mkyong.service.FetilizersService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fetilizers")
public class FetilizersController {
	
	@Autowired
	private FetilizersRepository repo;
	
	@Autowired
	private FetilizersService service;
	
	@GetMapping("/")
	  public  List<Fetilizers> findAll(Fetilizers fetilizers) {
	       return repo.findAll();
	         
	    }
//	 @GetMapping("/{id}") 
//	 public ResponseEntity<Fetilizers> findEmpById(@PathVariable int id) {
//		Fetilizers fetilizers=service.findById(id);
//		return new ResponseEntity<>(fetilizers,HttpStatus.OK);	
//	 }

	 @PostMapping("/save")
	 @ResponseStatus(HttpStatus.CREATED)
	Fetilizers saveFetilizers(@RequestBody Fetilizers fetilizers) {
		 return service.saveFetilizers(fetilizers);
	 }

@GetMapping("find/{name}") 
public String findEmpByPrice(@PathVariable String name) throws EmpNotFoundException{
	int price= service.getPrice(name);
	return "sssss"+price;

}

}
