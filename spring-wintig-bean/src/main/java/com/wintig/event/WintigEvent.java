package com.wintig.event;

import org.springframework.context.ApplicationEvent;

public class WintigEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private String name;

	public WintigEvent(Object source, String name) {
		super(source);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
