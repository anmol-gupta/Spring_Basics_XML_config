package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
