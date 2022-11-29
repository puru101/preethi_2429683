package com.employee.crud.EmployeeCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.crud.EmployeeCrud.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
