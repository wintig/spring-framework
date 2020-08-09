package com.wintig.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class B implements ApplicationContextAware, InitializingBean {


	public B() {
		System.out.println("B正在初始化");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("B初始化生命周期回调");
	}
}
