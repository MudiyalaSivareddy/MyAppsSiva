package com.mkyong.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mkyong.entity.Emp;
import com.mkyong.repository.EmpRepository;



@Service
public class EmpService {
@Autowired
	public EmpRepository repo;
@Autowired
public EmpService service ;

@PostConstruct
public void initDB() {
	List<Emp> emp=new ArrayList();
	emp.add(new Emp(1,"siva",26));
	emp.add(new Emp(2,"chaitvik",3));
	emp.add(new Emp(3,"venkat",31));
	emp.add(new Emp(4,"anu",24));
	repo.saveAll(emp);
}

	public Emp saveEmp(Emp emp) {
		return repo.save(emp);
		
	}

	public Optional<Emp> findById(int Eid) {
		// TODO Auto-generated method stub
		
		return repo.findById(Eid);
		
	}

public List<Emp> findByName(String name) {
		return repo.findByName(name);
		
	}

	

	
}
