package com.bah.data.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class CustomerAccountResource {

	//TODO Inject the stock account service
	@Autowired
	private CustomerAccountService accountService;

	//TODO Create a method to retrieve all the stock accounts
	@RequestMapping
	public Collection<StockAccount> findAllAccounts() {
		Collection<StockAccount> accounts = accountService.findAll();
		
		return accounts;
	}
	
	//TODO Create a method to retrieve a stock account by id
	@RequestMapping("/{id}")
	public StockAccount findAccountById(@PathVariable("id") Long id) {
		return accountService.findById(id);
	}
	
	//TODO Create a method to retrieve a stock account by name
	@RequestMapping("/name/{name}")
	public StockAccount findAccountByName(@PathVariable("name") String name) {
		return accountService.findByName(name).stream().findFirst().orElse(null);
	}
	
}
