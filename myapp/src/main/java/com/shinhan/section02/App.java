package com.shinhan.section02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.shinhan.section01.TV;

public class App {
	public static void main(String[] args) {
		f3();
	}
	private static void f4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("section02.xml");
		TV tv = ctx.getBean("lg", TV.class);
		tv.powerOff();
		tv.powerOn();
	}

	private static void f3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("section02.xml");
		//ApplicationContext -> bean이 다 로드됨
		
		People a =ctx.getBean("p2", People.class); 
		People b =ctx.getBean("p2", People.class); //얻으라는 의미이기 때문에 a와 b는 같음
		
		
		
		System.out.println(a==b); //주소 비교 scope="prototype" 이면 false
		//scope="singleton"이면 true

	}

	private static void f2() {
		//사용되기 전에 빈이 미리 로딩됨.
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("section02.xml");
		Car c1 = ctx.getBean("car1", Car.class);
		Car c2 = ctx.getBean("car2", Car.class);
		Car c3 = ctx.getBean("car3", Car.class);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

	private static void f1() {
		
		//BeanFactory 이용
		//spring이 값을 넣어주고 java가 실행 ->injection 
		//java가 제어하는게 아니라 spring이 제어함 ->제어의 역전
		
		
		Resource resource = new ClassPathResource("section02.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Car c1 = (Car)factory.getBean("car1");
		
		
		System.out.println(c1);
		
		Car c2 = factory.getBean("car2", Car.class);
		System.out.println(c2);
		
		Car c3 = factory.getBean("car3", Car.class);
		System.out.println(c3);
		
	}
}
