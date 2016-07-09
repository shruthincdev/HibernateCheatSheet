package com.demo.hibernate.relationships.onetoMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "faculty_table", schema="studentschema")
public class Faculty {
	@Id
	@GeneratedValue
	private int facultyId;
	private String facultyName;
	@ManyToOne
	@JoinColumn(name="departmentID_FK")
	private Department facultyDepartment;
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Department getFacultyDepartment() {
		return facultyDepartment;
	}
	public void setFacultyDepartment(Department facultyDepartment) {
		this.facultyDepartment = facultyDepartment;
	}
	
	

}
