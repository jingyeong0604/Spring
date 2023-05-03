package com.firstzone.aop2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Advice = 보조

@Component
@Aspect // aspectJ 이용할 수 있음.
@Order(1)
public class LoggingAdvice {

	@Pointcut("execution(* add(int))|| execution(* add(int,int))")
	public void targetMethod2() { //Pointcut을 쓰기 위해서 사용함. 이 함수를 찾을려는 목적으로 만듦
	}

	@Before("targetMethod2()")
	public void before(JoinPoint jp) {
		System.out.println("-----------before-----------");
		System.out.println("[" + jp.getSignature().getName() + "]");

	}

	@After("targetMethod2()")
	public void after() {
		System.out.println("--------------after-------------");

	}

	@AfterReturning("targetMethod2()")
	public void afterReturn() {
		System.out.println("--------------@AfterReturning-------------");
	}

	@AfterThrowing("targetMethod2()")
	public void afterThrow() {

		System.out.println("--------------@AfterThrowing-------------");

	}

	// 주업무의 전후에 수행됨
	@Around("targetMethod2()")
	public Object aroundTarget2(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("[주업무전에 수행]" + joinPoint.getSignature().getName() + "메서드");
		//--보조업무가 주업무에 끼어들었으므로 
		//주업무를 수행하도록 함.
		Object obj = joinPoint.proceed();
		//
		System.out.println("[주업무후에 수행]" + joinPoint.getSignature().getName() + "메서드");
		return obj;
	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[메서드 호출 전 : LogginAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 전");

		// 주업무를 수행한다.
		Object object = invocation.proceed();

		// 주업무 수행후 돌아와서 수행한다.
		System.out.println("[메서드 호출 후 : loggingAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 후");
		return object;
	}

}
