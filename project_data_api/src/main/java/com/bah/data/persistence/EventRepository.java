package com.bah.data.persistence;

import java.util.Collection;

import com.bah.data.domain.Event;

public interface EventRepository {

	/**
	 * Find one stock account by id
	 * 
	 * @param id the id
	 * @return the stock account with matching id, or null if not found.
	 */
	public Event findById(Integer id);

	/**
	 * Get all stock accounts in the repository.
	 */
	public Collection<Event> findAll();

	/**
	 * Find stock accounts by name
	 * 
	 * @param name
	 * @return the stock accounts with matching name, or empty collection if none found.
	 */
	public Collection<Event> findByName(String name);

	/**
	 * @return Total number of stock accounts in the repository
	 */
	public long count();

	/**
	 * Save a new stock account
	 * 
	 * @param account stock account to save
	 * @return
	 */
	public Event save(Event account);

	/**
	 * Delete the passed in stock account. Generally deletes the stock account with the passed in id.
	 * 
	 * @param account stock account to delete
	 */
	public void delete(Event account);
	
}
