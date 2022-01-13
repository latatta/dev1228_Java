package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest3 {
	// IntArrayTest 첫번째 예제는 day7 프로젝트에 있습니다.
	// int값 저장하는 배열을 활용하는 연습입니다. - (2)

	public static void main(String[] args) {

		// 배열의 크기는 20 -> 메모리에 할당
		int[] scores = new int[20];

		// 배열의 값은 난수 1 ~ 100 범위값 저장
		Random r = new Random(System.currentTimeMillis()); 		// 난수 발생에 필요한 seed값 설정

		for (int i = 0; i < scores.length; i++) {
			scores[i] = r.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(scores));

		// 값의 분포 개수를 90~100, 80~89, 70~79, 70 미만 범위로 출력합니다.
		int cntA = 0; // 카운트변수 : 조건에 맞는 경우 +1 증가합니다.
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;

		for (int i = 0; i < scores.length; i++) {
			// scores[0], score[1], score[2], ...
			if (scores[i] < 70) {
				cntD++;

			} else if (scores[i] < 80) {
				cntC++;

			} else if (scores[i] < 90) {
				cntB++;
				
			} else if (scores[i] <= 100) {
				cntA++;
			}
		}
		// 70 이상인 값의 개수 출력
		System.out.println("70 미만 값의 개수 : " + cntD);
		System.out.println("70 이상, 80미만 값의 개수 : " + cntC);
		System.out.println("80 이상, 90미만 값의 개수 : " + cntB);
		System.out.println("90 이상, 100 이하 값의 개수 : " + cntA);
	}

}
