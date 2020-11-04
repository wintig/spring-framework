package com.wintig.循环依赖;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB {

	@Autowired
	private ServiceA serviceA;

}
