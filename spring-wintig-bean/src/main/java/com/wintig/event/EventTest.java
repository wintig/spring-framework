package com.wintig.event;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("spring.xml");



		applicationContext.publishEvent(new WintigEvent("wintig", "wintigEvent"));

		applicationContext.start();
	}

}
