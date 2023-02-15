package com.bah.data.service;

import java.util.Collection;

import com.bah.data.domain.Customer;

public interface CustomerAccountService {
	
	public void persist(Customer item);

	public void persistBatch(Collection<Customer> items);

	public void remove(Customer item);

	public Customer findById(Long id);

	public Collection<Customer> findAll();

	public Collection<Customer> findByName(String name);

	public long size();
	
}
