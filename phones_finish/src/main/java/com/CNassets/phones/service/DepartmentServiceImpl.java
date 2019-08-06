package com.CNassets.phones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CNassets.phones.entity.Department;
import com.CNassets.phones.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl {

private DepartmentRepository departmentRepository;
	
	@Autowired
	public DepartmentServiceImpl(DepartmentRepository theDepartmentRepository) {
		departmentRepository = theDepartmentRepository ;
	}
	
	public List<Department> findAllDepartments() {
		return departmentRepository.findAll();
		
	}
}
