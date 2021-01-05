package com.wintig.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanDemo implements FactoryBean<Object> {

	@Override
	public Object getObject() throws Exception {
		return new FactoryB();
	}

	@Override
	public Class<?> getObjectType() {
		return FactoryB.class;
	}
}
