
package com.melaku.Custemor.Model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Custemor")
public class Custemor {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long custemorid;
     private String name;
     private String address;
     private String recordPoint;
     private String email;
	public Custemor(Long custemorid, String name, String address, String recordPoint, String email) {
		super();
		this.custemorid = custemorid;
		this.name = name;
		this.address = address;
		this.recordPoint = recordPoint;
		this.email = email;
	}
	public Long getCustemorid() {
		return custemorid;
	}
	public void setCustemorid(Long custemorid) {
		this.custemorid = custemorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecordPoint() {
		return recordPoint;
	}
	public void setRecordPoint(String recordPoint) {
		this.recordPoint = recordPoint;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Custemor [custemorid=" + custemorid + ", name=" + name + ", address=" + address + ", recordPoint="
				+ recordPoint + ", email=" + email + "]";
	}
	    
}
