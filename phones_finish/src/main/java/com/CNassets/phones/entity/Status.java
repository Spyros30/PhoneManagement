package com.CNassets.phones.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class Status {
	
	@Id	
	@Column(name="status_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	
	@Column(name="status")
	private String status;

	@OneToMany(mappedBy="statusInfo", cascade = CascadeType.ALL)
    private List<Phone> phoneInfo;
	
	public Status() {
		
	}

	public Status(int statusId, String status, List<Phone> phoneInfo) {
		super();
		this.statusId = statusId;
		this.status = status;
		this.phoneInfo = phoneInfo;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Phone> getPhoneInfo() {
		return phoneInfo;
	}

	public void setPhoneInfo(List<Phone> phoneInfo) {
		this.phoneInfo = phoneInfo;
	}

	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", status=" + status + ", phoneInfo=" + phoneInfo + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
