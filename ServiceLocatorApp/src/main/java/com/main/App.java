package com.main;

import com.service.Service;
import com.service.ServiceLocator;

public class App {
	public static void main(String[] args) {
		 Service service1 = ServiceLocator.getService("ServiceA");
	        service1.execute();

	        Service service2 = ServiceLocator.getService("ServiceB");
	        service2.execute();

	        // Reusing cached service
	        Service service3 = ServiceLocator.getService("ServiceA");
	        service3.execute();
	}
}
