package com.springquick.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint _jp) {
		String method = _jp.getSignature().getName();
		Object[] args = _jp.getArgs();
		
		System.out.println("[Before] " + method + "() 메소드 ARGS 정보: " + args[0].toString());
	}
}
