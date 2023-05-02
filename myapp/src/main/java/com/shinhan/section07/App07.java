package com.shinhan.section07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shinhan.section03.EmpService;

public class App07 {

	public static void main(String[] args) {
	//2.setter를 통해서 injection하기
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("section04.xml");
		//ApplicationContext -> 로드시에 xml문서가 로드되면서 빈(객체가)이 만들어진다
		
		DeptController controller= context.getBean("deptController", DeptController.class);
		controller.f1();
	}
}


