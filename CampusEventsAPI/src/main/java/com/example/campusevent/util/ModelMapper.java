package com.example.campusevent.util;

import com.example.campusevent.model.Event;
import com.example.campusevent.model.User;
import com.example.campusevent.payload.EventResponse;
import com.example.campusevent.payload.UserSummary;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ModelMapper {

    public static EventResponse mapEventToEventResponse(Event Event, User creator) {
        EventResponse EventResponse = new EventResponse();
        EventResponse.setId(Event.getId());
        EventResponse.setEventname(Event.getEventname());
        EventResponse.setLocation(Event.getLocation());
        EventResponse.setDate(Event.getDate());
        EventResponse.setTime(Event.getTime());

        UserSummary creatorSummary = new UserSummary(creator.getId(), creator.getUsername(), creator.getName());
        EventResponse.setCreatedBy(creatorSummary);


        return EventResponse;
    }
}