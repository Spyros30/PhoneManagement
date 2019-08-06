package com.CNassets.phones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CNassets.phones.entity.Abroad;
import com.CNassets.phones.entity.Department;
import com.CNassets.phones.entity.Phone;
import com.CNassets.phones.entity.Status;
import com.CNassets.phones.repository.AbroadRepository;
import com.CNassets.phones.repository.DepartmentRepository;
import com.CNassets.phones.repository.PhoneRepository;
import com.CNassets.phones.repository.StatusRepository;

@Service
public class PhoneServiceImpl implements PhoneService {

	private PhoneRepository phoneRepository;
	
	private DepartmentRepository departmentRepository;
	
	private AbroadRepository abroadRepository;
	
	private StatusRepository statusRepository;
	
	@Autowired
	public PhoneServiceImpl(PhoneRepository thePhoneRepository, DepartmentRepository theDepartmentRepository, AbroadRepository theAbroadRepository, StatusRepository theStatusRepository) {
		phoneRepository = thePhoneRepository ;
		departmentRepository = theDepartmentRepository;
		abroadRepository = theAbroadRepository;
		statusRepository = theStatusRepository;
	
	}

	@Override
	public Phone findByPhoneId(int phoneId) {
		
		Optional<Phone> result = phoneRepository.findById(phoneId);
		
		Phone thePhone = null;
		if (result.isPresent())
		{
			thePhone = result.get();
		}
		else {
			// we didn't find the tournament
			throw new RuntimeException("Did not find phone id - " + phoneId);
		}
		return thePhone;
	}
	
	@Override
	public Phone findById(int theId) {
		Optional<Phone> result = phoneRepository.findById(theId);
		
		Phone thePhone = null;
		if (result.isPresent())
		{
			thePhone = result.get();
		}
		else {
			// we didn't find the tournament
			throw new RuntimeException("Did not find phone id - " + theId);
		}
		return thePhone;
	}

	@Override
	public void save(Phone thePhone) {
		phoneRepository.save(thePhone);
	}

	@Override
	public void deleteById(int theId) {
		phoneRepository.deleteById(theId);
	}

	//public List<Department> findAllDepartments() {
	//	return departmentRepository.findDepartmentOnId();
		//
	//}

	@Override
	public List<Phone> findAll() {
		return phoneRepository.findAll();
	}

	@Override
	public List<Abroad> findAllAbroads() {
		return abroadRepository.findAll();
	}

	@Override
	public List<Status> findAllStatus() {
		return statusRepository.findAll();
	}

	@Override
	public List<Department> findAllDepartments() {
		return departmentRepository.findAll();
	}
}
