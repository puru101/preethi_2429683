package com.item.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.item.app.model.Department;

public interface DeptRepository extends JpaRepository<Department, Long>{

}
