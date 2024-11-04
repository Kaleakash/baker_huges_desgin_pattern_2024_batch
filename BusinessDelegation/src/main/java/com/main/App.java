package com.main;

import com.service.BusinessDelegate;
import com.service.Client;

public class App {
	public static void main(String[] args) {

		   
		        BusinessDelegate businessDelegate = new BusinessDelegate();
		        
		        businessDelegate.setServiceType("EJB");
		        Client client = new Client(businessDelegate);
		        client.doTask();
		        
		        businessDelegate.setServiceType("JMS");
		        client.doTask();
		   		

	}
}
