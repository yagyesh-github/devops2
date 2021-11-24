package com.springboot.sportyshoes.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="iname")
	private String iname;
	
	@Column(name="icategory")
	private String icategory;
	
	 
	 @Column(name="idate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	 private Timestamp idate;
	 
	 @Column(name = "iprice")
	 private String iprice;

	 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIcategory() {
		return icategory;
	}

	public void setIcategory(String icategory) {
		this.icategory = icategory;
	}


	public Timestamp getIdate() {
		return idate;
	}

	public void setIdate(Timestamp idate) {
		this.idate = idate;
	}

	public String getIprice() {
		return iprice;
	}

	public void setIprice(String iprice) {
		this.iprice = iprice;
	}
	 
	 
	 
	 
	 
	 
	 
}
