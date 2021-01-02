package com.wintig.processor;

import com.wintig.annotation.WintigService;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

@Component
public class WintigBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	/**
	 * 在实例化之前，可以对BeanDefinition进行修改和注册
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

		// 获取所有beanDefinitionNames
		String[] beanDefinitionNames = registry.getBeanDefinitionNames();

		for (String beanDefinitionName : beanDefinitionNames) {
			// 根据name获取beanDefinition
			BeanDefinition beanDefinition = registry.getBeanDefinition(beanDefinitionName);
		}

		// 新增beanDefinition
		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(GenericBeanDefinitionBean.class);
		// 属性设置
		MutablePropertyValues propertyValues = genericBeanDefinition.getPropertyValues();
		propertyValues.add("name", "wintig");
		registry.registerBeanDefinition("genericBeanDefinitionBean", genericBeanDefinition);

		// 删除指定beanDefinition
		registry.removeBeanDefinition("genericBeanDefinitionBean");

		// 自定义扫描器
		// 就完成了"com.wintig"路径下，有WintigService注解类的扫描
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
		scanner.addIncludeFilter(new AnnotationTypeFilter(WintigService.class));
		scanner.scan("com.wintig");
	}

	/**
	 * 拿到beanFactory容器，你可以根据业务进行扩展
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		DefaultListableBeanFactory listableBeanFactory = (DefaultListableBeanFactory)beanFactory;
		// 允许使用相同名称重新注册不同的bean实现
		listableBeanFactory.setAllowBeanDefinitionOverriding(true);
		// 允许循环依赖
		listableBeanFactory.setAllowCircularReferences(true);
	}


	public class GenericBeanDefinitionBean {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
