package com.bah.data.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.bah.data.domain.Event;

public class InMemoryEventRepository implements EventRepository {
	
//	private Integer id;
//	private String code;
//	private String title;
//	private String description;
	
//	private List<Event> accountData = new ArrayList<>(Arrays.asList(
//			new Event(1),
//			new Event(2), 
//			new Event(3),
//			new Event(4), 
//			new Event(5)));

	@Override
	public Event findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Event> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Event> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Event save(Event account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Event account) {
		// TODO Auto-generated method stub
		
	}

}
