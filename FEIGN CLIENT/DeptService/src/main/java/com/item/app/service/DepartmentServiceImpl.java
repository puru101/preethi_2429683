package com.item.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.app.model.Department;
import com.item.app.repository.DeptRepository;

@Service
public class DepartmentServiceImpl implements DeptService {

	@Autowired
	private DeptRepository deptRepo;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptRepo.save(department);
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return deptRepo.findById(departmentId).get();
    }
	

}
