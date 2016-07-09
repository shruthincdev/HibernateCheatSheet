package com.demo.hibernate.relationships.ManytoMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "delegate_table", schema="studentschema")
public class Delegate {
	
	@Id
	@GeneratedValue
	private int delegateId;
	private String delegateName;
	@ManyToMany
	@JoinTable(name="joindeligate_event_table", joinColumns={@JoinColumn(name="delegateId")}, inverseJoinColumns={@JoinColumn(name="eventId")})
	private List<Event> events = new ArrayList<Event>();
	
	
	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	

}
