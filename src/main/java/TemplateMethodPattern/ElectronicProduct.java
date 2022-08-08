package TemplateMethodPattern;

public abstract class ElectronicProduct {
	public abstract void powerOn();
	public abstract void operation();
	public abstract void powerOff();
	
	// �� �޼ҵ带 ����� �۵���ų ��!
	public void use() {
		// �۵� ������ ���ø�(Template)ȭ
		powerOn();
		operation();
		powerOff();
	}
}
