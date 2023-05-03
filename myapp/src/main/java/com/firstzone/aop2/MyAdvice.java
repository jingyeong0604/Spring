package com.firstzone.aop2;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice{

	@Pointcut("execution(* *(int, int))")
	public void pointCut() {}//이름 설정
	
	@Before("pointCut()")//설정한 이름의 함수에 적용하기
	public void before() {
		System.out.println("------MyAdvice --@Before-----");
	}
	
	
	@After("pointCut()")//설정한 이름의 함수에 적용하기
	public void after() {
		System.out.println("------MyAdvice --@After-----");
	}
	
	
	
	@AfterReturning("pointCut()")//설정한 이름의 함수에 적용하기
	public void afterReturning() {
		System.out.println("------MyAdvice --@AfterReturning-----");
	}
	
	@AfterThrowing("pointCut()")//설정한 이름의 함수에 적용하기
	public void afterthrowing() {
		System.out.println("------MyAdvice --@AfterThrowing-----");
	}
	
	// 주업무의 전후에 수행됨
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("----------주업무 전에 수행=--------");
		System.out.println("함수 이름은 : ["+jp.getSignature().getName()+"]");
		Object obj = jp.proceed();
		System.out.println("==================================");
		return obj;

	}
	
	

}
