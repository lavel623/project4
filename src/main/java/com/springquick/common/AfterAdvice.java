package com.springquick.common;

import org.aspectj.lang.JoinPoint;

public class AfterAdvice {
	public void finallyLog(JoinPoint _jp) {
		String method = _jp.getSignature().getName();
		Object[] args = _jp.getArgs();
		
		System.out.println("[After] " + method + "() 메소드 ARGS 정보: " + args[0].toString());
	}
}
