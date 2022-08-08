package com.springquick.common;

//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect	// Aspect = Pointcut + Advice
public class LogAdvice {
	/*
	 * public void printLog(JoinPoint _jp) {
	 * System.out.println("[Log] 비즈니스 로직 수행 전 동작"); }
	 */
	
	@Pointcut("execution(* com.springquick..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.springquick..*Impl.get*(..))")
	public void getPorintcut() {}
	
	// @Before("allPointcut()")
	// @AfterReturning("allPointcut()")
	// @AfterThrowing("allPointcut()")
	// @After("allPointcut()")
	// @Around("allPointcut()")
	@Before("allPointcut()")
	public void printLog() {
		System.out.println("[Log] 비즈니스 로직 수행 전 동작");
	}
}
