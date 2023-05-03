package com.firstzone.aop3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MemberRegisterAdvice {
	
//	@Pointcut("within(com.firstzone.aop3)")
	@Pointcut("execution(* print(..))")
	public void pointcut1() {}

	@Pointcut("execution(* execution(* print(..))")
	

	
	public void pointcut() {}
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("MemberRegisterAdvice :[주업무전에 수행] class 이름"+jp.getClass().getName()+"메서드");
		Object obj = jp.proceed();
		
		System.out.println("[주업무후에 수행]: "+jp.getSignature().getName()+"메서드");
		return obj;
	}
}
