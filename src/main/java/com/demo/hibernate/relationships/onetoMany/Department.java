package com.demo.hibernate.relationships.onetoMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department_table", schema="studentschema")
public class Department {
	@Id
	@GeneratedValue
	private int depId;
	private String depName;
	@OneToMany(targetEntity=Faculty.class, mappedBy="facultyDepartment", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Faculty> faculty;
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public List<Faculty> getFaculty() {
		return faculty;
	}
	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}

}
