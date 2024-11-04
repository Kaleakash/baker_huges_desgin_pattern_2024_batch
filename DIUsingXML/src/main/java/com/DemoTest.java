package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.display();
		
		Resource res  = new ClassPathResource("beans.xml"); // load the xml file 
		BeanFactory obj = new XmlBeanFactory(res);   // get beanfactory interface reference. 
		
//		Employee employee1 = (Employee)obj.getBean("emp1"); // pull the object from container 
//		employee1.display();
//		
//		Employee employee2 = (Employee)obj.getBean("emp1"); // pull the object from container 
//		employee2.display();
//		
//		Employee employee3 = (Employee)obj.getBean("emp2"); // pull the object from container 
//		employee3.display();
//		
//		Employee employee4 = (Employee)obj.getBean("emp2"); // pull the object from container 
//		employee4.display();
		
//		Employee employee5 = (Employee)obj.getBean("emp1");	// singleton : default or empty constructor  
//		System.out.println(employee5);
//		
//		Employee employee6 = (Employee)obj.getBean("emp2");	// prototype : default or empty constructor 
//		System.out.println(employee6);
//		
//		Employee employee7 = (Employee)obj.getBean("emp3");	// singleton : parameter constructor 
//		System.out.println(employee7);
//		
//		Employee employee8 = (Employee)obj.getBean("emp4");	// singleton : parameter constructor 
//		System.out.println(employee8);
		
//		Address add1 = (Address)obj.getBean("address");
//		System.out.println(add1);
		
		Employee employee = (Employee)obj.getBean("employee");
		System.out.println(employee);
	}

}
