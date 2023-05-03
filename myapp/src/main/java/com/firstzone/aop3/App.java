package com.firstzone.aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop3.xml");
		MemberRegister member =  ctx.getBean("memberRegisterAdvice", MemberRegister.class);
		member.memberInfo();
		member.register();
		member.print();
		
		System.out.println("------------");
		EmpRegister emp = ctx.getBean("emp",EmpRegister.class);
	}

}
