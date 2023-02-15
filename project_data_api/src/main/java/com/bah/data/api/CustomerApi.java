package com.bah.data.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.data.domain.Customer;

@RestController
@RequestMapping("/customers")

public class CustomerApi {

	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerApi() {
		Customer c1 = new Customer(1, "Jason", "password", "jason@bah.com");
		Customer c2 = new Customer(1, "Brian", "password", "brian@bah.com");
		Customer c3 = new Customer(1, "Sean", "password", "sean@bah.com");
		Customer c4 = new Customer(1, "John", "password", "john@bah.com");
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
	}
	
	@GetMapping
	public Collection<Customer> getAll(){
		return this.customerList;
	}
	
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") long id) {
		
		Customer customer = null;
		for(int i = 0; i < customerList.size(); i++) {
			if(customerList.get(i).getId() == id) {
				customer =customerList.get(i);
			}
		}
		
		return customer;
	}
	
}
