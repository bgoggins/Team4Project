package com.bah.data.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.data.domain.Event;

@RestController
@RequestMapping("/events")
public class EventApi {
	ArrayList<Event> eventList = new ArrayList<Event>();
	
	public EventApi() {
		Event e1 = new Event(1, "CNF001", "All-Java Conference", "Lectures and exhibits covering all Java topics");
		Event e2 = new Event(2, "WKS002", "Spring Boot Workshop", "Hands-on Spring Boot Workshop");
		Event e3 = new Event(3, "TRN001", "Angular Training Course", "Five day introductory training in Angular");
		Event e4 = new Event(4, "RNR004", "Rock n Roll Concert", "BAH Employees RocknRoll Concert");
		
		eventList.add(e1);
		eventList.add(e2);
		eventList.add(e3);
		eventList.add(e4);
	}
	
	@GetMapping
	public Collection<Event> getAll(){
		return this.eventList;
	}
	
	@GetMapping("/{EventId}")
	public Event getEventById(@PathVariable("EventId") long id) {
		
		Event Event = null;
		for(int i = 0; i < eventList.size(); i++) {
			if(eventList.get(i).getId() == id) {
				Event =eventList.get(i);
			}
		}
		
		return Event;
	}
	
}
