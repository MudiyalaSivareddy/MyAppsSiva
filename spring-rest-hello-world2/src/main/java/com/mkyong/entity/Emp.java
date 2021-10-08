package com.mkyong.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Emp")

public class Emp {
	@Id
	@GeneratedValue
	private int Eid;
	private String Ename;
	private int age;
	public Emp(){
			}
	public Emp(int eid, String ename, int age) {
		this.Eid = eid;
		this.Ename = ename;
		this.age = age;
	}
	public Emp(String ename, int age) {
			this.Ename = ename;
		this.age = age;
	}
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Emp [Eid=" + Eid + ", Ename=" + Ename + ", age=" + age + "]";
	}
	

}
