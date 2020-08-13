package com.wintig.test;

import com.wintig.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("aaa");
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext("com.wintig");

		Student student = (Student)applicationContext.getBean("student");
		System.out.println(student.getUserName());
	}

}
