package com.wintig.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.ReentrantLock;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				applicationContext = new AnnotationConfigApplicationContext();


		ReentrantLock lock = new ReentrantLock();
		lock.lock();

	}

}
