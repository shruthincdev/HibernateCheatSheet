package com.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "college_copy_table", schema="studentschema")
public class CollegeBeanCopy {
	
	@Id
	@Column(name="COLLEGE_ID")
	
	private int collegeId;
	
	@Column(name="COLLEGE_NAME", columnDefinition = "character varying(1000)")
	private String collegeName;

	@Column(name="COLLEGE_STATE")
	private String collegeState;

	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeState() {
		return collegeState;
	}
	public void setCollegeState(String collegeState) {
		this.collegeState = collegeState;
	}

}
