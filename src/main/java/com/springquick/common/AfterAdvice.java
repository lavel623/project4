package com.springquick.common;

import org.aspectj.lang.JoinPoint;

public class AfterAdvice {
	public void finallyLog(JoinPoint _jp) {
		String method = _jp.getSignature().getName();
		Object[] args = _jp.getArgs();
		
		System.out.println("[After] " + method + "() �޼ҵ� ARGS ����: " + args[0].toString());
	}
}
