package com.example.campusevent.service;

import com.example.campusevent.model.Event;
import com.example.campusevent.payload.EventRequest;
import com.example.campusevent.payload.EventResponse;
import com.example.campusevent.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	/*
	 * fetch all events
	 */
	public List<EventResponse> getAllEvents() {
		List<EventResponse> events = new ArrayList<>();

		for (Event event : eventRepository.findAll()) {

			EventResponse resp = new EventResponse();

			resp.setId(event.getId());
			resp.setEventname(event.getEventname());
			resp.setLocation(event.getLocation());
			resp.setDate(event.getDate());

			events.add(resp);

		}

		return events;
	}

	/*
	 * fetch an event
	 */
	public Event getEventById(Long id) {
		return eventRepository.findById(id).get();
	}

	/*
	 * create an event
	 */
	public String createEvent(EventRequest request) {

		String response = "Failed";

		Event event = new Event();

		event.setEventname(request.getEventname());
		event.setLocation(request.getLocation());
		event.setDate(request.getDate());

		Event saved = eventRepository.save(event);

		return saved != null ? "Saved" : response;
	}

	/*
	 * delete an event
	 */
	public String deleteEvent(Long eventid) {

		Optional<Event> toDelete = eventid != null ? eventRepository.findById(eventid) : Optional.empty();

		if (toDelete.isPresent()) {

			try {
				eventRepository.delete(toDelete.get());
				return "Deleted";
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		// eventRepository.deleteByIdIn(id);

		return "deleted";
	}

	/*
	 * update an event
	 */
	public String updateEvent(Long id, Event event) {
		Event eventt = getEventById(id);

		if (eventt != null) {
			eventt.setEventname(event.getEventname());
			eventt.setLocation(event.getLocation());
			eventt.setDate(event.getDate());
			Event saved = eventRepository.save(event);

			return saved != null ? "Updated successfully" : "failed to update";

		}

		return null;
	}
}
