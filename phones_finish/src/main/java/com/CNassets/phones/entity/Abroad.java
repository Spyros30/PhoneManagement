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
@Table(name="abroad")
public class Abroad {
	
	@Id
	@Column(name="abroad_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int abroadId;
	
	@Column(name="abroad")
	private String abroad;
	
	@OneToMany(mappedBy="abroadInfo", cascade = CascadeType.ALL)
    private List<Phone> phoneInfoAbroad;
	
	public Abroad() {
		
	}

	public Abroad(int abroadId, String abroad, List<Phone> phoneInfoAbroad) {
		super();
		this.abroadId = abroadId;
		this.abroad = abroad;
		this.phoneInfoAbroad = phoneInfoAbroad;
	}

	public int getAbroadId() {
		return abroadId;
	}

	public void setAbroadId(int abroadId) {
		this.abroadId = abroadId;
	}

	public String getAbroad() {
		return abroad;
	}

	public void setAbroad(String abroad) {
		this.abroad = abroad;
	}

	public List<Phone> getPhoneInfoAbroad() {
		return phoneInfoAbroad;
	}

	public void setPhoneInfoAbroad(List<Phone> phoneInfoAbroad) {
		this.phoneInfoAbroad = phoneInfoAbroad;
	}

	@Override
	public String toString() {
		return "Abroad [abroadId=" + abroadId + ", abroad=" + abroad + ", phoneInfoAbroad=" + phoneInfoAbroad + "]";
	}

	
	
	
}
