package com.CNassets.phones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.CNassets.phones.entity.Department;

@Repository("departmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query(value= "SELECT * from Department A, Phone B WHERE A.department_id = B.department_id", nativeQuery = true)
	List<Department> findDepartmentOnId();

}
