package com.employee.crud.EmployeeCrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Employee {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@NotEmpty( message = "First name cannot be null")
    private String firstName;
	
	@NotNull
	@NotEmpty( message = "Last name cannot be null")
    private String lastName;
	
	@NotNull
	@NotEmpty( message = "Designation cannot be null")
    private String designation;
	
    private int salary;
    
	public Employee() {

	}
	public Employee(Long id, String firstName, String lastName,String designation, int salary) {
	
		this.id = id;
		this.firstName = firstName;
		this.lastName= lastName;
		this.designation = designation;
		this.salary = salary;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}