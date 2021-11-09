package com.mkyong.service;

import java.util.ArrayList;

import java.util.List;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.entity.Emp;
import com.mkyong.error.EmpNotFoundException;
import com.mkyong.repository.EmpRepository;



@Service
public class EmpService {
@Autowired
	public EmpRepository repo;
@Autowired
public EmpService service ;

@PostConstruct
public void initDB() {
	List<Emp> emp=new ArrayList<Emp>();
	emp.add(new Emp(1,"siva",26));
	emp.add(new Emp(2,"chaitvik",3));
	emp.add(new Emp(3,"venkat",31));
	emp.add(new Emp(4,"anu",24));
	emp.add(new Emp(5,"siva2",26));
	repo.saveAll(emp);
}

	public Emp saveEmp(Emp emp) {
		return repo.save(emp);
		
	}
	
	public Optional<Emp> findById(int Eid) throws EmpNotFoundException  {
		// TODO Auto-generated method stub
						
			Optional<Emp> fetilizer= null;
				
				try {
					fetilizer=repo.findById(Eid);
					fetilizer.get().getEid();
 				}catch(Exception e) {
					throw new EmpNotFoundException("Emp Records Not avaiable");
					
				}
				 return fetilizer;
	}

public Optional<Emp> findByName(String name) {
		return repo.findByName(name);
		
	}



	

	
}
