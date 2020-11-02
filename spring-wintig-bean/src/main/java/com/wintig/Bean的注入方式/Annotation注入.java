package com.wintig.Bean的注入方式;

import com.wintig.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation注入 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				applicationContext = new AnnotationConfigApplicationContext(Annotation注入.class);

		Student student = applicationContext.getBean(Student.class);

		System.out.println(student);

	}

}
