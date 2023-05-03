package com.firstzone.aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
 public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("aop2.xml");
	Calculator cal  = context.getBean("proxyCal", Calculator.class);
	int result = cal.add(1,2);
	System.out.println(result);
 }
}
