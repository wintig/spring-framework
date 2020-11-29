package com.wintig.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadLocalScope implements Scope {

	private ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (threadLocal.get() != null) {
			return threadLocal.get();
		} else {
			// 这个方法就是去掉createBean方法
			Object object = objectFactory.getObject();
			threadLocal.set(object);
			return object;
		}
	}

	@Override
	public Object remove(String name) {
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {

	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}
}
