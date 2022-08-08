package com.springquick.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import com.springquick.user.UserVO;

@Service
@Aspect
public class AfterReturningAdvice {
	// _returnObj: 바인드 변수
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning="_returnObj")
	public void afterLog(JoinPoint _jp, Object _returnObj) {
		String method = _jp.getSignature().getName();
		if (_returnObj instanceof UserVO) {
			UserVO user = (UserVO)_returnObj;
			if (user.getRole().equals("Admin")) {
				System.out.println(user.getName() + " 로그인(Admin)");
			}
		}
		
		System.out.println("[AfterReturning] " + method + "() 메소드 리턴값: " + _returnObj.toString());
	}
}
