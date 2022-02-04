package helloJSP.model;

import java.math.BigDecimal;

public class Kullanici {
	
	private String name;
	private String surname;
	private Department department;
	private BigDecimal salary;
	
	
	
	
	public Kullanici() {
		super();
	}


	public Kullanici(String name, String surname,Department department,BigDecimal salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.department=department;
		this.salary=salary;
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
