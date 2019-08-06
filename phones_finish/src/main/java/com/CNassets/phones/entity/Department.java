package com.CNassets.phones.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="department")
public class Department {
	
	@Id	
	@Column(name="department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	
	@Column(name="department_name")
	private String departmentName;
	
	@OneToMany(mappedBy="departmentInfo", cascade = CascadeType.ALL)
    private List<Phone> phoneInfo;
	
	
	public Department() {
		
	}

	public Department(int departmentId, String departmentName, List<Phone> phones) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.phoneInfo = phones;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	
	public List<Phone> getPhones() {
		return phoneInfo;
	}

	public void setPhones(List<Phone> phones) {
		this.phoneInfo = phones;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", phoneInfo=" + phoneInfo
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
