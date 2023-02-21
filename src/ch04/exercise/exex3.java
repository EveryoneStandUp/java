package ch04.exercise;

public class exex3 {
	public static void main(String[] args) {
//		0
//		10
//		210
//		3210
//		43210
		
		for(int i=0; i<5; i++) {
			for(int j=i; j>=0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
