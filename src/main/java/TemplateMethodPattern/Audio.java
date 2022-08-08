package TemplateMethodPattern;

public class Audio extends ElectronicProduct {
	@Override
	public void powerOn() {
		System.out.println("Audio powerOn!");
	}
	
	@Override
	public void operation() {
		System.out.println("Audio operation");
	}
	
	@Override
	public void powerOff() {
		System.out.println("Audio powerOff!");
	}
}
