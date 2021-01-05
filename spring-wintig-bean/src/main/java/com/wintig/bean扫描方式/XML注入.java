package com.wintig.bean扫描方式;

import com.wintig.bean.Student;
import com.wintig.processor.WintigBeanDefinitionRegistryPostProcessor;
import com.wintig.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XML注入 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("spring.xml");

		Student student = applicationContext.getBean(Student.class);


		UserService userService = applicationContext.getBean(UserService.class);

		//userService.addUserInfo("111");
		userService.queryUser("111");

		// 销毁单例对象
		applicationContext.getBeanFactory().destroySingletons();
	}

}
