package com.example.campusevent.model;

import com.example.campusevent.model.audit.DateAudit;
import com.example.campusevent.model.audit.UserDateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "event", uniqueConstraints = { @UniqueConstraint(columnNames = { "eventname" }) })

public class Event extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(max = 40)
	private String eventname;

	@NotNull
	@Size(max = 20)
	private String location;

	private Date date;

//    @NotNull
//    @Size(max = 10)
//    private String time;

	public Event() {

	}

	public Event(String eventname, String location, Date date) {
		this.eventname = eventname;
		this.location = location;
		this.date = date;
//        this.time = time;
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

//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
}