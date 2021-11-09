package com.mkyong.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name= "Emp")

public class Emp {
	@Id
	private int Eid;
	@NotNull
	@Size(min=2,max=10,message="Lenth b/w in 2 to 10")
	private String name;
	@NotNull
	  @Min(value=1, message="must be equal or greater than 1")  
    @Max(value=100, message="must be equal or less than 100")  
	private int age;
	public Emp() {}
	public Emp(int eid, String name, int age) {
		this.Eid = eid;
		this.name = name;
		this.age = age;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
