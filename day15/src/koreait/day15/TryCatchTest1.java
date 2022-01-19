package koreait.day15;

import java.util.Scanner;

public class TryCatchTest1 {
	// 형식 : try {...원래 해야 할 명령들.. } catch() { ... Exception 발생 시 실행할 명령들... }
	//	-> 실행 중에 잘못된 값으로 발생하는 오류를 처리합니다.
	
	public static void main(String[] args) {
		try {
			// 테스트2
			String message = null;
			
			char temp = message.charAt(0);

			// 테스트1
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt(); // Exception 가능성 있음
			System.out.println("a = " + a);
			
		} catch (NullPointerException e1) {
			System.out.println("Null 참조");
			
		} catch (Exception e) { // Exception 이 발생한 오류 정보를 객체로 관리하고 참조변수는 e 입니다.
			// NullPointerException 제외하고 다른 Exception 발생시 처리되는 { } 입니다.
			
			System.out.println("잘못된 입력입니다.");
		}

		System.out.println("프로그램 끝");
	}

}
