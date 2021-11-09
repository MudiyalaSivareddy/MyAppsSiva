package com.mkyong.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.mkyong.entity.Fetilizers;

@EnableJpaRepositories
@Repository
public interface FetilizersRepository extends JpaRepository<Fetilizers, Integer>{

	//List<Fetilizers> findByName(String name);

	//Fetilizers getName(int price);


	Fetilizers findByName(String name);

}
