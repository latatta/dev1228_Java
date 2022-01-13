package practice_questions;

import java.util.Arrays;
import java.util.Random;

public class LottoDoWhileTest {

	public static void main(String[] args) {
		// LottoTest.java 의 while문을 do~ while 문으로 변경해보세요.-> isOk 변수 사용하지 않습니다.
		
		int[] lotto = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				do {
					temp = r.nextInt(45) + 1;
				} while (lotto[j] == temp);		// temp와 j 위치 이전의 값들을 각각 비교
				
				lotto[i] = temp;
			}	 // for - j end
		} 	// for - i end
		
		System.out.println(Arrays.toString(lotto));
	}

}
