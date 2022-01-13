package koreait.day6;

public class MethodTest {
	// 클래스(또는 객체)의 구성 : 필드, 메소드 
	// -> 메소드를 이해하는 연습. 단, 같은 클래스에서 사용되는 경우
	
	// static : 정적인(고정된), static 성질끼리 서로 사용 가능.
	public static void main(String[] args) {
		System.out.println(); 		// System은 클래스, out은 (객체형 = 참조형 = 클래스형)필드, println은 out의 메소드
		
		// 메소드 실행 - 메소드 이름 호출
		testMethod1(); 		// main 메소드 특징 : static, 실행할 수 있는 메소드는 static만 가능
		testMethod1();		// -> static은 static 성질을 갖는 요소들만 사용
// 		testmethod2(13, James); 	// 오류 -> 두번째 인자의 형식이 틀림
		testmethod2(123, "twice");
		testmethod2(456, "모모");
		testmethod22(1.23, 23, 4.56);		// 3개 인자값을 더해서 출력하는 메소드
//		testmethod22(24, 4.5, 1.8987);		// 인자값 전달할 때 자동캐스팅됩니다. 두번째 인자는 double에서 int로 자등캐스팅 불가능
		
		int result = testmethod3();	// 반환값(리턴값)이 있는 메소드는 변수를 사용하여 저장 또는 출력을 합니다.
		System.out.println("testmethod3 return = " + result);
		System.out.println("testmethod3 return = " + (testmethod3() + 11)); 	// 리턴값 연산
		System.out.println(testmethod33());
		
		System.out.println("testmethod4 return = " + testmethod4(34, 67));
		// testmethod44를 실행해서 리턴값을 변수 d_result에 저장하고 출력하세요.
		double d_reuslt = testmethod44(31.5, 325);
		System.out.println("testmethod44 return = " + d_reuslt);
		
		System.out.println(dayOfWeek(4)); 	// result 문자열의 참조값으로 내용을 출력
		}
		
	// 1. 인자(arguments)가 없고, 반환값도 없는(void) 메소드
	static void testMethod1() { 	// 메소드의 정의 연습1		// 메소드와 함수는 성격이 유사합니다.
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}
	
	// 2. 인자 O, 반환값 X
	// 인자는 개수 제한 X, 변수선언과 같은 방식으로 ,로 구분합니다. 인자는 메소드 실행에 필요한 데이터이다.
	static void testmethod2(int a, String name) { // 인자 2개
		// 메소드를 실행할 때는 정수, 문자열 순서에 맞게 값을 지정하고
		// 그 값을 a는 정수값, name은 문자열의 참조값을 저장
		System.out.println("정수값 = " + a);
		System.out.println("name = " + name);
	}
	
	// 예제
	static void testmethod22(double n1, int n2, double n3) {
		System.out.println("Sum = " + (n1 + n2 + n3));
	}
	
	// 3. 인자 X, 반환값 O(***반환되는 데이터의 형식***) 메소드
	static int testmethod3() {
		return 145;	// 반환값이 있는 형식에서는 꼭 있어야 하는 명령 -> return
	}
	
	// 연습 - "수요일"을 리턴하는 메소드
	static String testmethod33() {
		return "수요일";
	}
	
	// 4. 인자 O, 반환값 O
	static int testmethod4(int a, int b) {
		return a + b;
	}
	
	static double testmethod44(double a, int b) {
		double result = a + b;
		return result;
	}
	
	// 정수값을 전달받습니다. 1이면 "월요일", 2면 "화요일", 3이면 "수요일", ..., 7이면 일요일을 리턴하는 메소드
	// 리턴하는 메소드 -> 1 ~ 7 이외의 값은 "unknown"
	static String dayOfWeek(int i) {
		if (i == 1) return "월요일";
		else if (i == 2) return "화요일";
		else if (i == 3) return "수요일";
		else if (i == 4) return "목요일";
		else if (i == 5) return "금요일";
		else if (i == 6) return "토요일";
		else if (i == 7) return "일요일";
		else return "unknown";
	}
	
	
}


