package koreait.day10a;

import koreait.day10.MyClass2;

public class MyClass2Test {
	// MyClass2 클래스의 접근권한 확인
	
	public static void main(String[] args) {
		
		MyClass2 my = new MyClass2();	// *다른 패키지의 클래스는  사용할 때 import 필요
		
		// my. 로 보이는 필드와 안보이는 필드를 구분
		// 보이는 필드 : score
		// 안보이는 필드 : name, age
		
	}

}
