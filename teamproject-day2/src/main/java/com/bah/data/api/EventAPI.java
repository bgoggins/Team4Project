package com.bah.data.api;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.bah.data.domain.Event;
import com.bah.data.repository.EventsRepository;

@RestController
@RequestMapping("/events")
public class EventAPI {

	@Autowired
	EventsRepository repo;

	@GetMapping
	public Iterable<Event> getAll() {

		return repo.findAll();

	}

	@GetMapping("/{eventId}")
	public Optional<Event> getEventById(@PathVariable("eventId") long id) {

		return repo.findById(id);

	}

	@PostMapping
	public ResponseEntity<?> addEvent(@RequestBody Event newEvent, UriComponentsBuilder uri) {

		if (newEvent == null || newEvent.getId() != 0 || newEvent.getEventCode() == null || newEvent.getTitle() == null
				|| newEvent.getDescription() == null) {

			return ResponseEntity.badRequest().build();

		}

		newEvent = repo.save(newEvent);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newEvent.getId())
				.toUri();
		ResponseEntity<?> response = ResponseEntity.created(location).build();
		return response;

	}

	@PutMapping("/{eventId}")
	public ResponseEntity<?> putEvent(@RequestBody Event newEvent, @PathVariable("eventId") int eventId) {

		if (newEvent.getId() != eventId || newEvent.getEventCode() == null || newEvent.getTitle() == null) {
			return ResponseEntity.badRequest().build();
		}

		newEvent = repo.save(newEvent);

		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}

	@DeleteMapping("/{eventId}")
	public ResponseEntity<?> deleteEventById(@PathVariable("eventId") long id) {

		Event eventToDelete = repo.findById(id).orElse(null);
		if (eventToDelete != null) {
			repo.delete(eventToDelete);
		}

		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
