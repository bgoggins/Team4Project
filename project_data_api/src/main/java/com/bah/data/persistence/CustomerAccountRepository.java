package com.bah.data.persistence;

import java.util.Collection;

import com.bah.data.domain.Customer;

public interface CustomerAccountRepository {

	/**
	 * Find one stock account by id
	 * 
	 * @param id the id
	 * @return the stock account with matching id, or null if not found.
	 */
	public Customer findById(Integer id);

	/**
	 * Get all stock accounts in the repository.
	 */
	public Collection<Customer> findAll();

	/**
	 * Find stock accounts by name
	 * 
	 * @param name
	 * @return the stock accounts with matching name, or empty collection if none found.
	 */
	public Collection<Customer> findByName(String name);

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
	public Customer save(Customer account);

	/**
	 * Delete the passed in stock account. Generally deletes the stock account with the passed in id.
	 * 
	 * @param account stock account to delete
	 */
	public void delete(Customer account);
	
}
