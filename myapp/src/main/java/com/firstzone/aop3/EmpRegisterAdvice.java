package com.firstzone.aop3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component 
public class EmpRegisterAdvice {
	
	@Pointcut("execution()")
	public void pointcut() {}
	
	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		Object obj = jp.proceed();
		
		return obj;
	}
}
