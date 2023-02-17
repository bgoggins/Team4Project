package com.bah.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENTS")
public class Event {
	//  Workshop:
	//
	//  Create an Event class, and implement methods to manage event data.
//	"ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
//	"EVENT_CODE" VARCHAR(255), 
//	TITLE VARCHAR(255), 
//	DESCRIPTION VARCHAR(255)
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "EVENT_CODE")
	String eventCode;

	@Column(name = "TITLE")
	String title;

	@Column(name = "DESCRIPTION")
	String description;

	public Event() {
		
	}
	
	public Event(Long id, String eventCode, String title, String description) {
		super();
		this.id = id;
		this.eventCode = eventCode;
		this.title = title;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
	
	
	
}
