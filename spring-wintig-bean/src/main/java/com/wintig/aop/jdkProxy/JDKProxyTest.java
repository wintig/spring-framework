package com.wintig.aop.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxyTest {

    public static void main(String[] args) {

		ClassLoader classLoader = JDKProxyTest.class.getClassLoader();

		// 你所要生成类的接口字节码文件
		Class<?>[] interfaces = {
				People.class
		};

		// 我们给了你接口，接口里面有很多个方法，当我们需要调用这些方法的时候，里面肯定都是空的啊。
		// 这时候就可以通过调用InvocationHandler来实现这些方法。
		InvocationHandler invocationHandler = new Advice(new Wintig());

		People proxyObject = (People)Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        proxyObject.eat("土豆");
    }

}
