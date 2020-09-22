package com.bazinga.ws.models;

public class EmployeeInfo {
		
	private String name;
	private int id;
	private long salary;
	
	public EmployeeInfo() {
	}
	
	public EmployeeInfo(int id,String name,long salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
}
