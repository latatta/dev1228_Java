package koreait.day15;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// Exception 요약 : 문법 오류가 아닙니다. 실행하면서 발생하는 오류입니다.(발생 가능성을 고려해서 프로그래밍해야합니다.)
		//		-> 원인에 따라 다른 이름 XXXXXException이 발생하고, 이들은 Exception 클래스의 자식 클래스입니다.
		//		-> Exception 이 실행중에 발생하면 그 이후에는 프로그램이 그 시점부터 중단됩니다.
		//			따라서, Exception을 예상해고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
		
		// ===========================================================================
		// Exception 예시 4 :
		// Wrapper 클래스(Short, Integer, Double, Long...)에는 문자열을 기본형 타입으로 변환하는 메소드가 있습니다.		
		int b = Integer.parseInt("abc"); 	 // Integer.parseInt("123"); -> 정상 실행
				// 정수로 변환될 수 없는 문자열은 NumberFormatException 발생
		System.out.println("b = " + b);
			
		double c = Double.parseDouble("123,456,000.123");	// Double.parseDouble("3.14"); -> 정상실행
					// 콤마는 더블로 변환 불가능이기 때문에 NumberFormatException
		System.out.println("c = " + c);
		
		// ===========================================================================
		// Exception 예시 3
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();			// 키보드 입력을 정수로 변환하여 변수에 저장
		// 사용자 입력한 문자에 정수 이외의 것이 있을 때 InputMismatchException 발생

		//============================================================================
		// Exception 예시 2
		int[] nums = new int[5];		// 배열선언 : 요소 5개입니다.
		nums[5] = 100;		// 실행했을 때 ArrayIndexOutOfBoundsException이 발생 -> 인덱스 0 ~ 4
	
		
		//============================================================================
		// Exception 예시 1
		String message = null;
		
		char temp = message.charAt(0);		// message 문자열에서 첫번째(0) 글자 1개 가져옵니다.
		// 실행했을 때 NullPointerException이 발생 -> 이유 : message 참조객체가  null이기 때문
	}

}
