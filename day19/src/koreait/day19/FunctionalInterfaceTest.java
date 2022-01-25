package koreait.day19;

import java.util.Random;

public class FunctionalInterfaceTest {
	// 함수형 인터페이스 : 인터페이스 중에 추상메소드가 1개인 것은 다른 프로그래밍 언어에서 사용되는 함수 형식으로 표현할 수 있습니다. 
	//					자바에서는 람다식이라고도 불립니다.	가독성, 간결성을 위하여 사용
	
	
	public static void main(String[] args) {
		// WebSearch 인터페이스는 함수형 인터페이스 입니다.
		// 메소드이름은 생략하고 (인자선언) -> { 메소드의 실행내용 }	과 같은 형식으로 작성합니다.
		
		WebSearch w = new WebSearch() {
			
			@Override
			public void search(String url) {
				System.out.println("당신의 서치는 " + url + " 입니다."); 
			}
		};
		
		w.search("네이버(naver)");
		
		// 함수형 인터페이스는 익명클래스보다 더 간략화합니다.
		w = (String url) -> {System.out.println("Your Searching : " + url + "!!"); };
		w.search("Youtube");
		
		
		// FuncInterfaceA를 	1) 익명클래스로 객체 생성	
		FuncInterfaceA fiA = new FuncInterfaceA() {
			
			@Override
			public int methodA(int a, int b) {
				System.out.println("이 메소드는 2개 인자값을 곱해서 결과를 리턴합니다.");
				return a + b;
			}
		};
		
		int result = fiA.methodA(11, 12);		// 리턴값이 메소드는 출력 or 변수에 저장
		System.out.println("result : " + result);
		
		// 2) 람다식으로 객체 생성. 추상메소드는 두개의 정구밧을 범위로 하여 난수를 만들고 리턴합니다.
		//		추상메소드가 여러개인 인터페이스는 람다식으로 표현 불가능(익명클래스는 가능)
		fiA = (int a, int b) -> {
			Random r = new Random();
			return r.nextInt(b-a+1)+a;
			};
		
		System.out.println("람다식 표현 : " + fiA.methodA(1, 4));
		
	}
}
