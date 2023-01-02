package com.item.app.service;

import com.item.app.model.Department;

public interface DeptService {
	
	Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);


}
