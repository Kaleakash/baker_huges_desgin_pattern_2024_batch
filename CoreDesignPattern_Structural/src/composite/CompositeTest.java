package composite;

import java.util.*;
interface Employee {
	public void addEmployee(Employee emp);
	public void removeEmployee(Employee emp);
	public Employee getChild(int i);
	public String getName();
	public double getSalary();
	public void print();
}

class Manager implements Employee {
	private String name;
	private float salary;
	Manager(String name, float salary) {
		this.name = name;
		this.salary  = salary;
	}
	List<Employee> listOfEmp = new ArrayList<>();
	public void addEmployee(Employee emp){
		listOfEmp.add(emp);
	}
	public void removeEmployee(Employee emp){
		listOfEmp.remove(emp);
	}
	public Employee getChild(int i){
		return listOfEmp.get(i);
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public void print(){
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		ListIterator<Employee> list = listOfEmp.listIterator();
		System.out.println("Employee Info");
		while(list.hasNext()) {
			Employee e = list.next();
			e.print();	
		}
	}	
}
class Developer implements Employee {
	private String name;
	private float salary;
	Developer(String name, float salary) {
		this.name = name;
		this.salary  = salary;
	}
	
	public void addEmployee(Employee emp){
		
	}
	public void removeEmployee(Employee emp){
		
	}
	public Employee getChild(int i){
		return null;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public void print(){
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		
	}	
}
public class CompositeTest {
	public static void main(String args[]) {
	Employee e1 = new Developer("Seeta",14000);
	Employee e2 = new Developer("Reeta",16000);
	Employee mgr = new Manager("Raj",45000);
	mgr.addEmployee(e1);	mgr.addEmployee(e2);
	System.out.println("Manager info");
	mgr.print();
	}
}
