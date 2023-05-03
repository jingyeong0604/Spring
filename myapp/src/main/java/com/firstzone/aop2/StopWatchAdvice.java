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
import org.springframework.util.StopWatch;
// 보조업무
@Component
@Aspect //advisor+ target
@Order(2)
public class StopWatchAdvice {
	
	@Pointcut("within(com.firstzone.aop2.Calculator)")
	public void targetMethod() {}
	
	@Before("targetMethod()")
	public void before(JoinPoint jp) {
		System.out.println("-----------StopWatchAdvice before-----------");
		System.out.println("[" + jp.getSignature().getName() + "]");//jp.getSignature().getName() 함수의 이름

	}
	
	@After("targetMethod()")
	public void after() {
		System.out.println("--------------after-------------");

	}
	
	@AfterReturning("targetMethod()")
	public void afterReturn() {
		System.out.println("--------------@AfterReturning-------------");
	}
	
	@AfterThrowing("targetMethod()")//오류가 발생했을때
	public void afterThrow() {
		System.out.println("--------------@AfterThrowing-------------");
		
	}
	
	// 주업무의 전후에 수행됨
	@Around("targetMethod()")
	public Object invoke(ProceedingJoinPoint jp) throws Throwable {
		
		System.out.println("[메서드 호출 전 : StopWatch");
		
		System.out.println(jp.getSignature().getName()  + "메서드 호출 전");
		
		StopWatch watch = new StopWatch("계산시간");
		watch.start();
		// 주업무를 수행한다.
		Object object = jp.proceed();

		// 주업무 수행후 돌아와서 수행한다.
		// 보조업무
	
		System.out.println("StopWatchAdvice*****" + jp.getSignature().getName() + "메서드 호출 후");
		watch.stop();
		
		/*
		 * @Pointcut("execution(* add(int))") public void targetMethod2() {
		 * System.out.println(); }
		 */
	

		System.out.println("StopWatchAdvice 주업무 수행 시간:" + watch.getTotalTimeMillis());
		System.out.println(watch.prettyPrint());
		return object;
	}
	
	

}