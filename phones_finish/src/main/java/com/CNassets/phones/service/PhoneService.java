package com.CNassets.phones.service;

import java.util.List;

import com.CNassets.phones.entity.Abroad;
import com.CNassets.phones.entity.Department;
import com.CNassets.phones.entity.Phone;
import com.CNassets.phones.entity.Status;

public interface PhoneService {

    public Phone findById(int theId);
	
	public Phone findByPhoneId(int phoneId);
	
	public void save(Phone thePhone);
	
	public void deleteById(int theId);
	
	public List<Department> findAllDepartments();

	public List<Phone> findAll();

	public List<Abroad> findAllAbroads();
	
	public List<Status> findAllStatus();
}
