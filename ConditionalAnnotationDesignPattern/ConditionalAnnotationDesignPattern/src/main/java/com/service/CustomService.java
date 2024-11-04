package com.service;

import org.springframework.stereotype.Service;

@Service
public class CustomService {
    private final String message;

    public CustomService(String message) {
        this.message = message;
    }

    public CustomService() {
		// TODO Auto-generated constructor stub
    	this.message="default message";
	}
    public void printMessage() {
        System.out.println("CustomService message: " + message);
    }
}

