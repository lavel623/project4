package com.springquick.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void exceptionLog(JoinPoint _jp, Exception _exceptObj) {
		String method = _jp.getSignature().getName();
		
		System.out.println("[AfterThrowing] " + method + "() 메소드 수행 중 예외 발생!");
		
		if (_exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적합한 값을 입력되었습니다.");
		} else if (_exceptObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if (_exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}
}
