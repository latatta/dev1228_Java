package koreait.day9;

import java.util.Arrays;
import java.util.Random;

public class ObjectArgMethod {
	// int 배열의 정수값 중에서 최대값/최소값 구하는 메소드 - 참조값을 인자로 전달하는 연습

	public static void main(String[] args) {

		int[] arr = new int[10];
		Random r = new Random(); // 난수 범위는 1 ~ 100

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(arr));		// 정수 배열을 인자로 사용

		int max; // max 초기값 : 1) 배열의 인덱스 0번값 2) 비교될 다른값들보다 작은값
					// 비교 범위 : 1) 배열 인덱스 1 ~ 마지막 인덱스 2) 0 ~ 마지막 인덱스

		max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i]; // 최대값은 다른 값들보다 큰 값이 되어야 하므로, 그렇지 않을 경우 max의 값을 그 값으로 변경한다
		}

		System.out.println("최댓값 : " + max);

		int min; // min 초기값 : 1) 배열의 인덱스 0번값 2) 비교될 다른 값들보다 큰값
					// 비교 범위 : 1) 배열 인덱스 1 ~ 마지막 인덱스 2) 0 ~ 마지막 인덱스

		min = 999;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}

		System.out.println("최소값 : " + min);

		// 메소드로 실행해보기
		System.out.println("메소드로 구한 최대값 : " + arrayMaxValue(arr));
		System.out.println("메소드로 구한 최대값 : " + arrayMinValue(arr));
		System.out.println("메소드로 구한 합계 : " + arraySumValue(arr));
		System.out.println("메소드로 구한 평균 : " + arrayAvgValue(arr));
		
		
		double[] darr = new double[10];
		
		for (int i = 0; i < darr.length; i++) {
//			darr[i] = r.nextDouble();			// 0 ~ 1 사이의 실수
//			darr[i] = r.nextDouble()*10;		// 0 ~ 10 사이의 실수
			darr[i] = r.nextDouble()*9 + 1;			// 0 ~ 9 사이의 실수 + 1 	-> 1 ~ 10 사이의 실수
			
		}
		
		System.out.println("Arrays.toString 메소드 오버로딩 확인");
		System.out.println(Arrays.toString(darr));		// 실수 배열을 인자로 사용

		// 메소드 오버로딩(overloading)	- 메소드 이름은 같으나 인자 형식이 다르다
		//							- 반환값은 같은형식
		// 대표적인 메소드 - Arrays.toString()
		
	}

	// 메소드 작성으로 구현해봅니다. : 최대값 / 최소값을 구하기 위해 다룰 데이터는 배열에 있습니다. -> 배열 변수는 참조 변수
	// -> 메소드 인자가 참조 타입이 됩니다. -> 데이터 자체를 전달하지 않고 데이터 저장 주소를 전달
	// 메소드의 반환값 : 최대값 또는 최소값 결과
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
	
	// 합계를 구하는 메소드
	static int arraySumValue(int[] array) {
		
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
	
}
