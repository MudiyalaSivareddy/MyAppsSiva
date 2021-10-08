package com.mkyong.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mkyong.entity.Emp;
import com.mkyong.repository.EmpRepository;

@Service
public class EmpService {
@Autowired
	public EmpRepository repo;
@Autowired
public EmpService service;

	public Emp saveEmp(Emp emp) {
		return repo.save(emp);
		
	}

	public Optional<Emp> findById(int Eid) {
		// TODO Auto-generated method stub
		return repo.findById(Eid);
	}
	
}
