package com.shinhan.section03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App03 {
	public static void main(String[] args) {
		
		//2.setter를 통해서 injection하기
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("section03.xml");
		//ApplicationContext -> 로드시에 xml문서가 로드되면서 빈(객체가)이 만들어진다
		
		EmpService service= context.getBean("service1", EmpService.class);
		service.empAll();
	}
}
