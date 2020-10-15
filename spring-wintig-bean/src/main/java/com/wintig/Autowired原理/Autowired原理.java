package com.wintig.Autowired原理;

import com.wintig.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired原理 {

	/**
	 * Spring的注入方式其实只有2种：1构造方法   2set方法
	 *
	 * 注入模型有4种
	 * no：不采用自动注入
	 * byType：根据类型去找
	 * byName：根据名字去找
	 * construct：根据构造方法去找，选择最多的那个构造方法
	 *
	 * byName 和 byType只能说是注入模型，找Bean和注入Bean是不一样的技术
	 *
	 * 当一个类中的属性使用了@Autowired，那么spring就不会使用set去注入，首选会根据类型去选择要注入的bean。
	 * 但是如果我们@Autowired的属性是一个interface，而有多个实现类那么type明显不行，这时候就需要byName;
	 *
	 * public class MySQLJdbc;
	 * public class OracleJdbc;
	 *
	 * 失败案例1：
	 * @Autowired
	 * private JDBC jdbc;
	 * 肯定是无法注入的，首先byType发现有2个实现，之后再byteName发现根本找不到，那么就会报错
	 *
	 *
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("spring.xml");

		AlibabaGroup alibabaGroup = applicationContext.getBean(AlibabaGroup.class);

		System.out.println(alibabaGroup);

	}

}
