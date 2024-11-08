package com.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedEventListener {

	@EventListener
    public void handleUserCreatedEvent(UserCreatedEvent event) {
        System.out.println("Received user created event for username: " + event.getUsername());
    }
}
