package com.CNassets.phones.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@Column(name="phone_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;

	@Column(name="brand")
	private String brand;
	
	@Column(name="model")
	private String model;
	
	@Column(name="IMEI")	
	private BigInteger imei;
	
	@Column(name="price")
	private String price;
	
	@ManyToOne
	@JoinColumn(name="status_id")
	private Status statusInfo;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department departmentInfo;
	
	@Column(name="owner_name")
	private String ownerName;
	
	@Column(name="full_number")
	private BigInteger fullNumber;
	
	@Column(name="short_number")
	private BigInteger shortNumber;
	
	@Column(name="program")
	private String program;
	
	@Column(name="Sim_no")
	private String simNo;
	
	@Column(name="PIN")
	private int pin;
	
	@Column(name="PUK")
	private int puk;
	
	@ManyToOne
	@JoinColumn(name="abroad_id")
	private Abroad abroadInfo;
	
	@Column(name="notes")
	private String notes;
	

	public Phone() {
		
	}
	
	public Phone(int phoneId, String brand, String model, BigInteger imei, String price, Status statusInfo,
			Department departmentInfo, String ownerName, BigInteger fullNumber, BigInteger shortNumber, String program,
			String simNo, int pin, int puk, Abroad abroadInfo, String notes) {
		super();
		this.phoneId = phoneId;
		this.brand = brand;
		this.model = model;
		this.imei = imei;
		this.price = price;
		this.statusInfo = statusInfo;
		this.departmentInfo = departmentInfo;
		this.ownerName = ownerName;
		this.fullNumber = fullNumber;
		this.shortNumber = shortNumber;
		this.program = program;
		this.simNo = simNo;
		this.pin = pin;
		this.puk = puk;
		this.abroadInfo = abroadInfo;
		this.notes = notes;
	}





	public int getPhoneId() {
		return phoneId;
	}





	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public String getModel() {
		return model;
	}





	public void setModel(String model) {
		this.model = model;
	}





	public BigInteger getImei() {
		return imei;
	}





	public void setImei(BigInteger imei) {
		this.imei = imei;
	}





	public String getPrice() {
		return price;
	}





	public void setPrice(String price) {
		this.price = price;
	}





	public Status getStatusInfo() {
		return statusInfo;
	}





	public void setStatusInfo(Status statusInfo) {
		this.statusInfo = statusInfo;
	}





	public Department getDepartmentInfo() {
		return departmentInfo;
	}





	public void setDepartmentInfo(Department departmentInfo) {
		this.departmentInfo = departmentInfo;
	}





	public String getOwnerName() {
		return ownerName;
	}





	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}





	public BigInteger getFullNumber() {
		return fullNumber;
	}





	public void setFullNumber(BigInteger fullNumber) {
		this.fullNumber = fullNumber;
	}





	public BigInteger getShortNumber() {
		return shortNumber;
	}





	public void setShortNumber(BigInteger shortNumber) {
		this.shortNumber = shortNumber;
	}





	public String getProgram() {
		return program;
	}





	public void setProgram(String program) {
		this.program = program;
	}





	public String getSimNo() {
		return simNo;
	}





	public void setSimNo(String simNo) {
		this.simNo = simNo;
	}





	public int getPin() {
		return pin;
	}





	public void setPin(int pin) {
		this.pin = pin;
	}





	public int getPuk() {
		return puk;
	}





	public void setPuk(int puk) {
		this.puk = puk;
	}





	public Abroad getAbroadInfo() {
		return abroadInfo;
	}





	public void setAbroadInfo(Abroad abroadInfo) {
		this.abroadInfo = abroadInfo;
	}





	public String getNotes() {
		return notes;
	}





	public void setNotes(String notes) {
		this.notes = notes;
	}





	//@Override
	//public String toString() {
		//return "Phone [phoneId=" + phoneId + ", brand=" + brand + ", model=" + model + ", imei=" + imei + ", price="
			//	+ price + ", statusInfo=" + statusInfo + ", departmentInfo=" + departmentInfo + ", ownerName=" + ownerName
				//+ ", fullNumber=" + fullNumber + ", shortNumber=" + shortNumber + ", program=" + program + ", simNo="
				//+ simNo + ", pin=" + pin + ", puk=" + puk + ", abroadInfo=" + abroadInfo + ", notes=" + notes + "]";
	//}


}
