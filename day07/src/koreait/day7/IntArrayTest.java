package koreait.day7;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest {		// 정수값 배열 연습
	// 배열 : 일반변수는 변수 1개에 데이터 1개를 저장합니다. 많은 데이터를 저장할 때 변수를 많이 선언하지 않고 배열을 사용
	
	public static void main(String[] args) {
		// 배열 변수 선언
		// 1) 초기화를 같이 합니다.
		int [] arr1 = {78, 65, 89, 94};		// [] -> 배열 기호, {} -> 배열값 나열
				// 배열의 크기 : 4 (4개 * 4바이트 = 16바이트)
		// 2) 초기화 없이 배열의 크기만 정합니다.
		int [] arr2 = new int[10];
		
		// 배열은 객체와 유사한 성격입니다. arr1, arr2는 참조변수(배열값들이 저장된 주소를 변수가 저장합니다.)
		
		System.out.println("arr1의 (길이)크기 : " + arr1.length);
		System.out.println("arr1의 (길이)크기 : " + arr2.length);
		
		// 배열 데이터의 위치(숫자 0부터 시작) : 인덱스, []
		System.out.println("arr1 배열 3번째 데이터의 값 : " + arr1[2]);		
		System.out.println("arr1 배열 3번째 데이터의 값 : " + arr2[2]);		
			
		// arr1 배열의 모든 값을 출력하고 싶다. 배열의 친구 : for문
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] 의 데이터 값 : " + arr1[i]);
		}
		
		// 배열 특정위치에 데이터를 저장합니다. arr2 배열 5번째 위치에 78을 저장해보세요.
		arr2[4] = 78;
		System.out.println("arr2 배열 5번째 데이터의 값 : " + arr2[4]);
		
		// 1) Random 클래스로 1~46범위의 값을 난수로 만들어서 arr2 배열에 10개 저장하기
		Random r = new Random();
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = r.nextInt(46) + 1;
		}
		
		// 2) arr2 배열의 모든값 출력하기 : 줄바꿈 없이 하세요.(공백으로 구분)
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}	// 중복된 값이 있을까요? 네
		
		// ** 2번의 출력을 한번에 하는 방법 : Array 클래스 사용
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2);			// 해시코드(식별값) 출력
		
		// ****Int배열과 Double배열은 비슷하다.****
		
		// 발전방향 : arr2 배열의 난수값 만들때 중복된 값은 제외합니다. 그리고 6개를 한쌍으로 5번 만듭니다. -> Lotto
		
	}

}
