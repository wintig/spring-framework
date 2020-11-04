package com.wintig.factoryBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wintig")
public class FactoryBeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				applicationContext = new AnnotationConfigApplicationContext(FactoryBeanTest.class);

		// 拿到的只能是FactoryBeanDemo产生的实例对象
		// 它的实例是在factoryBeanObjectCache缓存里面
		Object beanDemo = applicationContext.getBean("factoryBeanDemo");
		System.out.println("FactoryBean产生的对象 : " + beanDemo);

		// 想要拿到FactoryBeanDemo这个实例，需要加一个&
		// 它的实例实在一级缓存里面
		FactoryBeanDemo factoryBeanDemo = (FactoryBeanDemo)applicationContext.getBean("&factoryBeanDemo");
		System.out.println("FactoryBean这个对象 ：" + factoryBeanDemo);

	}

}
