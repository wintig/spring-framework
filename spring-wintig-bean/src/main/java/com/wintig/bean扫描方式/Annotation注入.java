package com.wintig.bean扫描方式;

import com.wintig.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annotation注入 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				applicationContext = new AnnotationConfigApplicationContext(Annotation注入.class);

		Student student = applicationContext.getBean(Student.class);

		System.out.println(student);

	}

}
