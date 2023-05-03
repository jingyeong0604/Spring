package com.shinhan.section04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shinhan.section02.Car;
import org.shinhan.section06.License;
import com.shinhan.section04.People;

public class App04 {
	public static void main(String[] args) {
		
		//2.setter를 통해서 injection하기
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("section04.xml");
		//ApplicationContext -> 로드시에 xml문서가 로드되면서 빈(객체가)이 만들어진다
		
		
		Book b1 = context.getBean("book",Book.class);
		
		Car c1 = context.getBean("myCar", com.shinhan.section02.Car.class); //bean의 이름 설정 
		License l1 = context.getBean("license", License.class);
		People p1 = context.getBean("people", People.class);//component시 앞에만 소문자로 자동 변환되어 들어감
		EmpService service = context.getBean("empSer",EmpService.class);
		service.empAll();
		
		
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(l1);
	}
}
