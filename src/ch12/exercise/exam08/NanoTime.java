package ch12.exercise.exam08;

public class NanoTime {
	public static void main(String[] args) {
		int[] scores = new int[1000];
		long startNano = System.nanoTime();
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		long endNano = System.nanoTime();
		System.out.println(avg);
		System.out.println(endNano - startNano);
	}
}
