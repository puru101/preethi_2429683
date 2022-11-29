package com.employee.crud.EmployeeCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.crud.EmployeeCrud.model.Employee;
import com.employee.crud.EmployeeCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository repo;
	
	public List<Employee> listAll() {
        return repo.findAll();
    }
     
    public void save(Employee std) {
        repo.save(std);
    }
     
    public Employee get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}