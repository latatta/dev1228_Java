package practice_questions;

import java.util.Arrays;
import java.util.Random;

public class IntMaxMin {

	public static void main(String[] args) {
		// 정수형 배열의 값 중에서 최대값/최소값 찾기
		int[] arr = new int[10];
		Random r = new Random();

		// 정수형 배열에 랜덤값 지정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1; // 1 ~ 10 중 랜덤하게 지정
		}

		int max = arr[0];
		int min = arr[0];
		
		// 최댓값 추출
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        }
        
        // 최소값 추출
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] < min) {
        		min = arr[i];
        	}
        }
        
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.println(min);
		
	}

}
