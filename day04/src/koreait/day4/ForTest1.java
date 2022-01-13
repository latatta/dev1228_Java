package koreait.day4;

public class ForTest1 {

	public static void main(String[] args) {
		
		// 명령문의 반복 1
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");

		// 명령문의 반복 2
		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");
		
		for (int i = 0; i < 5; i++) 		// 반복 횟수 제어를 위한 변수 i : ㅑ = 0(시작값), 조건 i < 5, 증강 i = i + 1
			System.out.println("hello!!!!");	// 반복되는 부분
		
		for (int i = 0; i < 0; i++)			// 조건 : i < 0  -> 시작값 i = 0 < 0 은 거짓이므로 출력 안됨
			System.out.println("ㅎㅇㅎㅇ!!!!");
		
		for (int i = 0; i < 5; i++)
			System.out.println("헬로우! (" + i + ")"); 	// i = 0, 0 < 5 참  -> 출력 실행 -> i++
														// i = 1, 1 < 5 참  -> 출력 실행 -> i++
														// i = 2, 2 < 5 참  -> 출력 실행 -> i++
														// 		:
														// i = 5, 5 < 5 거짓 -> for문 종료
		
		
		// 직접 테스트 15 ~ 19라인을 for문 이용해서 출력 
		for (int i = 1; i < 6; i++)
			System.out.println("hello!(" + i + ")");
		
		// 조건식에 변수를 활용
		int end = 100;
		for (int i = 0; i < end; i+= 10)
			System.out.println(i);
	}

}
