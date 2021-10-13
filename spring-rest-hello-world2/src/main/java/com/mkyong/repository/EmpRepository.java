package com.mkyong.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.mkyong.entity.Emp;
@EnableJpaRepositories
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {

		public List<Emp> findByName(String name);

}
