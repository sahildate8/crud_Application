package com.sahilCURDspringboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // two values will never be match
	private int empid;
	
	@Column(name = "empname")
	private String empname;
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Long getEmpphoneno() {
		return empphoneno;
	}

	public void setEmpphoneno(Long empphoneno) {
		this.empphoneno = empphoneno;
	}

	public String getEmpadress() {
		return empadress;
	}

	public void setEmpadress(String empadress) {
		this.empadress = empadress;
	}

	@Column(name ="empphoneno")
	private Long empphoneno;
	
	@Column(name = "empadress")
	private String empadress;
	

}
