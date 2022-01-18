package koreait.day14;

public class MyMath {
	// 배열에서 최대값, 최소값, 합계, 평균을 구하는 메소드를 만들었습니다.
	// -> 메소드 오버로딩으로 다른 형식의 데이터들을 처리하도록 메소드를 정의해봅시다.
	
	static int arrayMaxValue(int[] array) {		

		int max;
		max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

	static int arrayMinValue(int[] array) {
		int min; 
		
		min = 999;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		return min;
	}
	
	static double arrayMaxValue(double[] array) {
		double max;
		max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) 	max = array[i];			
		}
		return max;
	}
	
	// 합계를 구하는 메소드
	static int arraySumValue(int[] array) {
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	static int arraySumValue(double[] array) {
	
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	
	// 평균을 구하는 메소드
	static double arrayAvgValue(int[] array) {
		
		int sum = arraySumValue(array);
		double avg = (double) sum/array.length;
		
		return avg;
	}
	
	static double arrayAvgValue(double[] array) {
				
		int sum = arraySumValue(array);		
		double avg = (double) sum/array.length;
		
		return avg;
	}
	
	
}
