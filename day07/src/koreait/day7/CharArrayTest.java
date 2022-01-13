package koreait.day7;

public class CharArrayTest {
	// char 타입의 배열 연습
	
	public static void main(String[] args) {
		// 배열의 선언
		char [] charr1 = {'i', 'a', 'm', 'j', 'a', 'v', 'a'};
		char [] charr2 = new char[20];
		

		System.out.println("charr1의 (길이)크기 : " + charr1.length);
		System.out.println("charr1의 (길이)크기 : " + charr2.length);
		

		System.out.println("charr1 배열 3번째 데이터의 값 : " + charr1[2]);		
		System.out.println("charr1 배열 3번째 데이터의 값 : " + charr2[2]);		
		
		//**
		for (int i = 0; i < charr1.length; i++) {
			System.out.print(charr1[i]);
		}
		
		// 문자타입 char 의 배열은 문자열과 유사합니다.
		System.out.println(charr1);		// 위의 **for문과 동일한 출력
		
// 		charr2 = "hello hi goodbye";		// 오류 : char 배열에 바로 문자열 대입은 오류
		charr2 = "hello hi goodbye".toCharArray();
		System.out.println(charr2);
		
		charr2 = "hello hi goodbye goodbye goodbye".toCharArray();		// 선언된 배열의 크기보다 클 때 
		System.out.println("charr2.length : " + charr2.length);			// -> 배열의 크기가 커집니다.
	}

}
