package com.UpcomingEvents.UpcomingEvents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UpcomingEvents.UpcomingEvents.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
