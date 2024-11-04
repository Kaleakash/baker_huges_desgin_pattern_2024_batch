package com.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ApplicationEventPublisher eventPublisher;

    public UserService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void createUser(String username) {
        // Logic to create a user (omitted for brevity)
        System.out.println("User created: " + username);
        
        // Publish the UserCreatedEvent
        UserCreatedEvent event = new UserCreatedEvent(this, username);
        eventPublisher.publishEvent(event);
    }
}
