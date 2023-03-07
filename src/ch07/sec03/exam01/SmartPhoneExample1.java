package ch07.sec03.exam01;

public class SmartPhoneExample1 {
	public static void main(String[] args) {
		SmartPhone1 myPhone = new SmartPhone1("갤럭시", "은색");

		System.out.println("모델:" + myPhone.getModel());
		System.out.println("색상:" + myPhone.getColor());
	}
}
