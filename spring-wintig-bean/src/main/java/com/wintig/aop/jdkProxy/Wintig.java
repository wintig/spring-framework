package com.wintig.aop.jdkProxy;

public class Wintig implements People {

    @Override
    public String eat(String param) {
        System.out.println("我正在吃：" + param);
        return param;
    }

}
