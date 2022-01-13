package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		// 난수 1~45 범위의 값을 중복된 값이 없도록 6개 생성하고 배열에 저장

		int[] lotto = new int[6];
		Random r = new Random();

		for (int i = 0; i < lotto.length; i++) {
			int temp = 0;
			boolean isOk = true;
			
			while (isOk) {		// isOK 변수 없이 while(true) 써도 됨
				temp = r.nextInt(45) + 1;
				int j;
				for (j = 0; j < i; j++) {
					// 현재 배열 인덱스 i의 앞에 있는 배열값들과 temp 값을 비교
					if (temp == lotto[j]) {
						break;	// for - j 에서 탈출
					}
					
				}	// for - j end
				if (j == i) isOk = false;		// 비교하는동안 같은 값이 없을때 입니다.		// isOK변수를 안쓸때는 break; 사용
				
			}	// while end
			lotto[i] = temp;
			
		}	// for - i end
		System.out.println(Arrays.toString(lotto));
	}

}
