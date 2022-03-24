package com.example.campusevent.service;

import com.example.campusevent.model.Event;
import com.example.campusevent.payload.EventRequest;
import com.example.campusevent.payload.EventResponse;
import com.example.campusevent.repository.EventRepository;
import com.example.campusevent.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	public List<EventResponse> getAllEvents() {
		List<EventResponse> events = new ArrayList<>();
		
		for(Event event : eventRepository.findAll()) {
			
			EventResponse resp = new EventResponse();
			
			resp.setId(event.getId());
			resp.setEventname(event.getEventname());
			resp.setLocation(event.getLocation());
			resp.setDate(event.getDate());
			resp.setTime(event.getTime());
			
			events.add(resp);
			
		}
		
		return events;
	}
	
//	public List<EventResponse> getEventSelection(UserPrincipal currentUser, EventResponse request) {
//		List<EventResponse> events = new ArrayList<>();
//		return events;
//	}
//	
	
	public String createEvent(EventRequest request) {
		
		String response = "Failed";
		
		Event event = new Event();
		
		event.setEventname(request.getEventname());
		event.setLocation(request.getLocation());
		event.setDate(request.getDate());
		
		Event saved = eventRepository.save(event);
		
		return saved != null ? "Saved" :  response;
	}
	
	   public String deleteEvent(Long id) {
		   
		  Optional<Event> toDelete = id != null ? eventRepository.findById(id) : Optional.empty();
		  
		  if(toDelete.isPresent()) {
			  
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
}
