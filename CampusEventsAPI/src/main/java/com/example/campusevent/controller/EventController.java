package com.example.campusevent.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.campusevent.model.Event;
import com.example.campusevent.payload.EventRequest;
import com.example.campusevent.payload.EventResponse;
import com.example.campusevent.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {

	@Autowired
	private EventService eventService;

	/*
	 * get all events
	 */
	@GetMapping("/getallevents")
	public List<EventResponse> getAllEvents() {
		return eventService.getAllEvents();
	}

	/*
	 * fetch an event
	 */
	@GetMapping("/getevent/{id}")
	public Event getEvent(@PathVariable("id") Long id) {
		return eventService.getEventById(id);
	}

	/*
	 * create an event
	 */
	@PostMapping("/createevent")
	public String createEvent(@Valid @RequestBody EventRequest request) {
		return eventService.createEvent(request);
	}

	/*
	 * delete an event
	 */
	@DeleteMapping("/deleteevent/{id}")
	public String deleteEventById(@PathVariable("id") Long eventId) {

		return eventService.deleteEvent(eventId);

	}

	/*
	 * update an event
	 */
	@PutMapping("/updateevent/{id}")
	public String updateEvent(@PathVariable("id") long id, @RequestBody Event event) {

		return eventService.updateEvent(id, event);

	}

}