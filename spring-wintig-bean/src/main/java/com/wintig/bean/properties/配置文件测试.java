package com.wintig.bean.properties;

import com.wintig.bean.Student;
import com.wintig.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class 配置文件测试 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("spring.xml");

		MySQLPropertiesBean mySQLPropertiesBean = applicationContext.getBean(MySQLPropertiesBean.class);

		System.out.println(mySQLPropertiesBean.getName());

	}

}
