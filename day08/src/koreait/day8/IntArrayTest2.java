package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest2 {
	// IntArrayTest 첫번째 예제는 day7 프로젝트에 있습니다.
	// int값 저장하는 배열을 활용하는 연습입니다. - (1)
	
	public static void main(String[] args) {
		
		// 배열의 크기는 20 -> 메모리에 할당
		int[] scores = new int[20];
		
		// 배열의 값은 난수 1 ~ 100 범위값 저장
		Random r = new Random();
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = r.nextInt(100) + 1;
		}
				
		System.out.println(Arrays.toString(scores));
		
		// 20개 배열의 값 중에서 70 이상의 값 검색 - 인덱스와 값 출력
		int cnt = 0;
		
		for (int i = 0; i < scores.length; i++) {
			// scores[0], score[1], score[2], ...
			if (scores[i] >= 70) {
				System.out.println(i + "\t" + scores[i]);
				cnt++;
			}
		}		
		// 70 이상인 값의 개수 출력
		System.out.println("70 이상 값의 개수 : " + cnt);
	}

}
