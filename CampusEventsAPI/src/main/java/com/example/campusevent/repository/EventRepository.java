package com.example.campusevent.repository;

import com.example.campusevent.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	 Optional<Event> findByLocation(String location );

	    
	    long countByCreatedBy(Long userId);
	    
	    Page<Event> findByCreatedBy(Long userId, Pageable pageable);


	    Optional<Event> findByEventname(String eventname);

	    Boolean existsByEventname(String eventname);

	    Boolean existsByLocation(String location);
}