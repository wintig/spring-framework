package com.wintig.transaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@EnableTransactionManagement
@MapperScan
public class EnableTransactionManagementBean {
}
