package com.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table", schema="studentschema")
public class EmployeeBean {
	@Id
	@Column(name="employee_id")
	private int empid;
	
	@Column(name="employee_name")
	private String empName;
	
	@Column(name="employee_designation")
	private String empDesignation;
	
	@Column(name="employee_salary")
	private int empSalary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	
	

}
