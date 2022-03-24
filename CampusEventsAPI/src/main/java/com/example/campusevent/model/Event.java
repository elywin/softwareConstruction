package com.example.campusevent.model;

import com.example.campusevent.model.audit.UserDateAudit;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "event", uniqueConstraints = {
		@UniqueConstraint(columnNames= {
				"eventname"
		})
})

public class Event extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String eventname;

    @NotBlank
    @Size(max = 20)
    private String location;

    @NotBlank
    private Date date;
    
    @NotBlank
    @Size(max = 10)
    private String time;

    public Event() {

    }

    public Event(String eventname, String location, Date date,String time ) {
        this.eventname = eventname;
        this.location = location;
        this.date = date;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}