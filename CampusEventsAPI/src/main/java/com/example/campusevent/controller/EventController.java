package com.example.campusevent.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.campusevent.payload.EventRequest;
import com.example.campusevent.payload.EventResponse;
import com.example.campusevent.security.CurrentUser;
import com.example.campusevent.security.UserPrincipal;
import com.example.campusevent.service.EventService;
@RestController
@RequestMapping("/api/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/getallevents")
    public List<EventResponse> getAllEvents() {
        return eventService.getAllEvents();
    }
	
//	@GetMapping("/myselection")
//    public List<EventResponse> getMovieSelection(@CurrentUser UserPrincipal currentUser, @Valid @RequestBody EventResponse request) {
//        return eventService.getEventSelection(currentUser, request);
//    }
	
	@PostMapping("/createevent")
    public String createEvent(@Valid @RequestBody EventRequest request) {
        return eventService.createEvent(request);
    }
	
	   @DeleteMapping("/deleteevent/{id}")
	    public String deleteEventById(@PathVariable("id") Long eventId)
	    {
	  
		   return eventService.deleteEvent(eventId);
	       
	    }
	
}