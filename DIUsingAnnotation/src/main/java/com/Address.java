package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component      			 // <bean class="com.Employee"></bean> by default id is class name using camel naming rule 
public class Address {		// address,
@Value(value = "Mumbai")
private String city;
@Value(value = "Mh")
private String state;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
