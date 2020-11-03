package com.wintig.bean扫描方式;

import com.wintig.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XML注入 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("spring.xml");

		Student student = applicationContext.getBean(Student.class);

		System.out.println(student);

	}

}
