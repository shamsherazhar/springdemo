package com.spring.pract.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String name;
	
	private Department department;

	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
