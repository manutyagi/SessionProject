package com.stackroute.sessionProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.sessionProject.model.Demo;

public class ApplicationStarter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Demo demo = (Demo) context.getBean("sizzler");
		System.out.println(demo.getMessage());
	}
}
