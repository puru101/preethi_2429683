package com.item.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.item.app.common.DeptDto;
@FeignClient

(value = "deptService", url = "http://localhost:6666")
public interface APIClient {
	
    @GetMapping(value = "/department/{id}")
    DeptDto getDepartmentById(@PathVariable("id") String id);

}