package com.wintig.factoryBean;

import com.wintig.bean.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

@Service
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
