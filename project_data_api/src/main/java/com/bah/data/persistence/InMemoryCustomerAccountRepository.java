package com.bah.data.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.bah.data.domain.Customer;

public class InMemoryCustomerAccountRepository implements CustomerAccountRepository {

	/** This is simply to eliminate the need to provide an in-memory database! */
	private List<Customer> accountData = new ArrayList<>(Arrays.asList(
			new Customer("John Smith", "john@bah.com", 1),
			new Customer("Linda Hamilton", "linda@bah.com", 2), 
			new Customer("Jose Gomez", "jose@bah.com", 3),
			new Customer("John Smith", "john@bah.com", 4), 
			new Customer("Bill Jones", "bill@bah.com", 5)));
//
//	private SortedMap<String, Customer> createStocks() {
//		SortedMap<String, Customer> stockMap = new TreeMap<>();
//		
//		// Generates a random number between 0 and 5
//		int numStocks = (int) (Math.random() * 6);
//						
//		// Always return at least one stock
//		if (numStocks == 0) { 
//			numStocks = 1;
//		}
//		
//		Customer ibm = new Customer("IBM", 100, 126);
//		Customer google = new Customer("GOOG", 100, 1557);
//		Customer microsoft = new Customer("MSFT", 100, 208);
//		Customer facebook = new Customer("FB", 100, 243);
//		Customer amazon = new Customer("AMZN", 100, 3119);
//		
//		List<Customer> stockArray = new ArrayList<>(Arrays.asList(
//				ibm, google, microsoft, facebook, amazon
//				));
//		
//		for (int i = 0; i < numStocks; i++) {
//			stockMap.put(stockArray.get(i).getSymbol(), stockArray.get(i));
//		}
//		
//		return stockMap;
//	}
//	
//	@Override
//	public Customer findById(Intenger id) {
//		// Uses Java 8 Streams, and filters with a lambda that matches on id value.
//		Optional<Customer> accountOptional = accountData.stream().filter(account -> account.getId().equals(id))
//				.findAny();
//
//		return accountOptional.orElse(null); // Returns item if found, else returns null
//	}
//
//	@Override
//	public Collection<Customer> findAll() {
//		return Collections.unmodifiableCollection(accountData);
//	}
//
//	@Override
//	public Collection<Customer> findByName(String name) {
//		return accountData.stream().filter(account -> account.getName().toLowerCase().equals(name.toLowerCase()))
//				.collect(Collectors.toList());
//	}
//
//	@Override
//	public long count() {
//		return accountData.size();
//	}
//
//	@Override
//	public Customer save(Customer account) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public void delete(Customer account) {
//		throw new UnsupportedOperationException();
//	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Customer> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer save(Customer account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Customer account) {
		// TODO Auto-generated method stub
		
	}
	
}
