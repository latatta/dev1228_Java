package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class RealLotto {
	// 확률을 반영해서 LottoTest.java를 새로운 알고리즘으로 구현합니다.
	
	public static void main(String[] args) {
		int[] numbers = new int[45];
		Random r = new Random();
		
		for (int i = 0; i < 45; i++) {		// 인덱스 범위 : 0 ~ 44
			numbers[i] = i + 1;				// 값 범위 : 1 ~ 45
		}
		System.out.println("배열 초기값 -------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("---------------------------------------");
		
		int[] lotto = new int[6];
		int k;		// 삭제할 위치의 인덱스 -> 랜덤한 값
		for (int cnt = 0; cnt < 6; cnt++) {
			
			// 1. 인덱스 범위를 -1씩 줄이기 위해 난수 발생 범이도 변경합니다.
			k = r.nextInt(45 - cnt); // 경계값을 45(0 ~ 44) -> 44(0 ~ 43) -> 43(0 ~ 42) -> 42(0 ~ 41) -> 41(0 ~ 40) ->
										// 40(0 ~ 39)

			// 2. k번째 위치의 데이터를 lotto배열에 저장
			lotto[cnt] = numbers[k];
			
			// 3. **배열에서 데이터 삭제**
			for (int i = k; i < numbers.length - 1; i++) {
				numbers[i] = numbers[i + 1]; // 인덱스 i + 1의 배열값을 인덱스 i의 값으로 변경.

			}	
			System.out.println(Arrays.toString(numbers));
		
		}
		System.out.println("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));
		
		// 오름차순 정렬 : 작은값에서 큰값 순서대로 위치를 바꿉니다.
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
		/*
		 * k = 23; // 삭제할 위치의 인덱스 for (int i = k; i < numbers.length - 1; i++) {
		 * numbers[i] = numbers[i + 1]; // 인덱스 i + 1의 배열값을 인덱스 i의 값으로 변경. }
		 * System.out.println(Arrays.toString(numbers));
		 * 
		 * k = 7; // 삭제할 위치의 인덱스 for (int i = k; i < numbers.length - 1; i++) {
		 * numbers[i] = numbers[i + 1]; // 인덱스 i + 1의 배열값을 인덱스 i의 값으로 변경. }
		 * System.out.println(Arrays.toString(numbers));
		 */
		
	}

}
