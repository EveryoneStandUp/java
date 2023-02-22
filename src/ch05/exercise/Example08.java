package ch05.exercise;

public class Example08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total = 0;
		int totalSum = 0;
		for(int i=0; i<array.length; i++) {			
			total += array[i].length;			
			for(int j=0; j<array[i].length; j++) {	
				totalSum += array[i][j];				
			}
		}
		System.out.println("전체 합: " + totalSum);
		double totalAvg = (double) totalSum / total;
		System.out.println("전체 평균: " + totalAvg);
	}
}
