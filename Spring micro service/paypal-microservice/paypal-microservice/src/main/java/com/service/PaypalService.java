package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Paypal;
import com.repository.PaypalRepository;

@Service
public class PaypalService {

	@Autowired
	PaypalRepository paypalRepository;

	@Autowired
	RestTemplate restTemplate;
	
	public String createAccount(Paypal paypal) {
		Optional<Paypal> result = paypalRepository.findById(paypal.getEmailid());
		if(result.isPresent()) {
			return "Account already exists";
		}else {
			paypalRepository.save(paypal);
			return "Account created successfully";
		}
	}
	
	public String findBalanceAmount(String emailid) {
		Optional<Paypal> result = paypalRepository.findById(emailid);
		if(result.isPresent()) {
			Paypal paypal = result.get();
			//String output = restTemplate.getForObject("http://localhost:8181/account/findBalance/"+paypal.getAccno(), String.class);
			String output = restTemplate.getForObject("http://ACCOUNT-SERVICE/account/findBalance/"+paypal.getAccno(), String.class);
			return output;
		}else {
			
			return "Paypal account not present";
		}
	}
}
