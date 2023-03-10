package com.bah.data.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.data.domain.Registration;

@RestController
@RequestMapping("/registrations")
public class RegistrationApi {
ArrayList<Registration> registrationList = new ArrayList<Registration>();
	
	public RegistrationApi() {
		Registration r1 = new Registration(1L, "1", "2", new Date(), "please email me the event details");
		Registration r2 = new Registration(2L, "2", "2", new Date(), "send transportation and hotel booking");
		Registration r3 = new Registration(3L, "3", "3", new Date(), "defer payments for a week");
	
		registrationList.add(r1);
		registrationList.add(r2);
		registrationList.add(r3);

	}
	
	@GetMapping
	public Collection<Registration> getAll(){
		return this.registrationList;
	}
	
	@GetMapping("/{RegistrationId}")
	public Registration getRegistrationById(@PathVariable("RegistrationId") long id) {
		
		Registration Registration = null;
		for(int i = 0; i < registrationList.size(); i++) {
			if(registrationList.get(i).getId() == id) {
				Registration =registrationList.get(i);
			}
		}
		
		return Registration;
	}
	
}
