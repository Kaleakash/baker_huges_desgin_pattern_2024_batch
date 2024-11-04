package singleresponsibility;

/*class EmployeeDetails {
private int id;
private String name;
private float salary;
private String companyName;
private String projectName;
private String city;
private String state;
private float taxAmount;
private String panNumber;
public void displayPersonalDetails() {

}
public void displayCompanyDetails() {

}
public void displayAddress Details() {

}
public void calculateTax() {

}
}*/
class Employee {
private int id;
private String name;
private float salary;
private Address add;
private Company company;
private ITTax tax;
//setter and getter methods;
public void displayPersonalDetails() {

}
}
class Address {
private String city;
private String state;
//setter and getter method 
}
class Company {
private String companyName;
private String projectName;
//setter and getter methods 
}
class ITTax {
private String panNumber;
private float taxAmount;
//setter and getter methods

}


