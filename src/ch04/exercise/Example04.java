package ch04.exercise;

public class Example04 {
	public static void main(String[] args) {

//	    do {
//		num1 = ((int)(Math.random()*6)) + 1;
//		num2 = ((int)(Math.random()*6)) + 1;
//		
//		System.out.printf("(%d, %d)%n", num1, num2);
//	    } while ((num1 + num2) != 5);

		int num1;
		int num2;

		while (true) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;

			System.out.printf("(%d, %d)%n", num1, num2);
			if ((num1 + num2) == 5) {
				break;
			}
		}
	}
}