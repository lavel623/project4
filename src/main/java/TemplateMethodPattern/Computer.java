package TemplateMethodPattern;

public class Computer extends ElectronicProduct {
	@Override
	public void powerOn() {
		System.out.println("Computer powerOn!");
	}
	
	@Override
	public void operation() {
		System.out.println("Computer operation");
	}
	
	@Override
	public void powerOff() {
		System.out.println("Computer powerOff!");
	}
}
