package TemplateMethodPattern;

public abstract class ElectronicProduct {
	public abstract void powerOn();
	public abstract void operation();
	public abstract void powerOff();
	
	// 이 메소드를 사용해 작동시킬 것!
	public void use() {
		// 작동 순서의 템플릿(Template)화
		powerOn();
		operation();
		powerOff();
	}
}
