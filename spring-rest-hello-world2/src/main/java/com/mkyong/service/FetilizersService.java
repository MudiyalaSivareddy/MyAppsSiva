package com.mkyong.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.entity.Emp;
import com.mkyong.entity.Fetilizers;
import com.mkyong.error.EmpNotFoundException;
import com.mkyong.repository.EmpRepository;
import com.mkyong.repository.FetilizersRepository;

@Service
public class FetilizersService {
	@Autowired
	private FetilizersRepository repo;

@PostConstruct
public void initDB() {
	List<Fetilizers> fetilizers=new ArrayList();
	//String[] tags={"metal"};
	fetilizers.add(new Fetilizers(1,"DAP",10,new String[] {"Metal"},false,4.5,"/assets/imgages/Fertilizers/1.jpg",new String[] {"india"},"50 left"));
	fetilizers.add(new Fetilizers(2,"DAP1",20,new String[] {"Liquid"},false,4.5,"/assets/imgages/Fertilizers/2.jpg",new String[] {"india"},"30 left"));
	fetilizers.add(new Fetilizers(3,"DAP2",30,new String[] {"Metal"},false,4.5,"/assets/imgages/Fertilizers/3.jpg",new String[] {"india"},"20 left"));
	repo.saveAll(fetilizers);
}

/*
 * public Fetilizers findById(int id) {
 * 
 * return repo.findById(id).orElseThrow(()-> new
 * EmpNotFoundException("Emp by Id "+ id +" was not updated")); }
 */
public int getPrice(String name) throws EmpNotFoundException {
	Fetilizers fetilizer= null;
	int amount=0;
	try {
		fetilizer=repo.findByName(name);
		amount=fetilizer.getPrice();		
	}catch(Exception e ) {
		throw new EmpNotFoundException("Fetilizer Records Not avaiable");
		
	}
	 return amount;
}

public Fetilizers saveFetilizers(Fetilizers fetilizers) {
	// TODO Auto-generated method stub
	return repo.save(fetilizers);
}

}
