package com.klef.jfsd.exam.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer 
{
	@Id
	@Column(name = "cid")
	private int id;
	@Column(name="customer_name",length=100,nullable = false)
	private String name;
	@Column(name="customer_email",length=100,nullable = false)
	private String email;
	@Column(name="customer_contact",length=100,nullable = false)
	private String phonenumber;
	@Column(name="customer_address",length=100,nullable = false)
	private String address;
	@Column(name="customer_dob",length=100,nullable = false)
	private String dateofbirth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
}
