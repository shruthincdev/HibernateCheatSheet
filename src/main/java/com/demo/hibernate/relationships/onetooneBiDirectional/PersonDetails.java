package com.demo.hibernate.relationships.onetooneBiDirectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persondetails_table", schema="studentschema")
public class PersonDetails {
	@Id
	@GeneratedValue
	@Column(name="pDetail_PK")
	private int personDetailId;
	private String zipcode;
	private String job;
	private String income;
	@OneToOne(mappedBy="personDetails", cascade=CascadeType.ALL)
	@JoinColumn
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPersonDetailId() {
		return personDetailId;
	}
	public void setPersonDetailId(int personDetailId) {
		this.personDetailId = personDetailId;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
}
