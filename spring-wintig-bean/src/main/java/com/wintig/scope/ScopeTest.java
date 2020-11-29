package com.wintig.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.wintig")
public class ScopeTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				applicationContext = new AnnotationConfigApplicationContext(ScopeTest.class);


		Object beanDemo = applicationContext.getBean("prototypeBean");
		System.out.println(beanDemo);


	}

}
