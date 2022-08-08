package com.springquick.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* com.springquick..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.sprintquick..*Impl.get*(..))")
	public void getPointcut() {}
}
