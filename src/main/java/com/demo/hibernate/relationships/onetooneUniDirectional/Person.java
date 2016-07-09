package com.demo.hibernate.relationships.onetooneUniDirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_table", schema="studentschema")
public class Person {
	@Id
	@GeneratedValue
	private int personId;
	
	private String personName;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="pDetails_FK")
	private PersonDetails personDetails;
	

	public PersonDetails getPersonDetails() {
		return personDetails;
	}
	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	

}
