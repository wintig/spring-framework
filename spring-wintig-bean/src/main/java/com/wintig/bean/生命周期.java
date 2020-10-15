package com.wintig.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

//@Component
public class 生命周期 implements BeanNameAware, InitializingBean {

	// 如果想要给字符串设置注入，我们使用@Autowired肯定没办法，就需要使用Aware回调方式注入
	private String beanName;

	private HashMap<String, Object> map;

	@Override
	public void setBeanName(String name) {

	}

	@Override
	public void afterPropertiesSet() throws Exception {

		// Award注入完成之后，需要执行某些初始化的方法

		// 也可以使用xml指定 init-method

		map = new HashMap<>();
		map.put("name", "tig");

	}
}
