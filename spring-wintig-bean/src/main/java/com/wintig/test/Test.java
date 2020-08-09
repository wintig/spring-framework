package com.wintig.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.locks.ReentrantLock;

@ComponentScan("com.wintig")
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				applicationContext = new AnnotationConfigApplicationContext(Test.class);

	}

}
