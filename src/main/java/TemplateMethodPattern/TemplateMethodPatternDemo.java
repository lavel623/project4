package TemplateMethodPattern;

public class TemplateMethodPatternDemo {
	public static void main(String[] args) {
		//ElectronicProduct ep = new Audio();
		ElectronicProduct ep = new Computer();
		ep.use();
	}
}
