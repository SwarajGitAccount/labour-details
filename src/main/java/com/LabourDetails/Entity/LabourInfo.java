package com.LabourDetails.Entity;

import javax.persistence.*;


@Entity
@Table(name="LabourDetails")
public class LabourInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="full_name",nullable=false,length=70)
	private String fullName;
	private byte age;
	@Column(name="working_site",nullable=false,length=50)
	private String city;
	@Column(name="site_state",nullable=false,length=50)
	private String state;
	@Column(name="contact_info",nullable=false,unique=true,length=12)
	private long mobileNo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobieNo) {
		this.mobileNo = mobieNo;
	}
	
	

}
