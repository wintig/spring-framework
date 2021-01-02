package com.wintig.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class WintigApplicationListener implements ApplicationListener<WintigEvent> {

	@Override
	public void onApplicationEvent(WintigEvent event) {
		System.out.println(event.getName());
	}

}
