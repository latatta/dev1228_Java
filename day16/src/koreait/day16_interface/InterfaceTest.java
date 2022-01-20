package koreait.day16_interface;

public class InterfaceTest {

	public static void main(String[] args) {
		// 기본적인 방식
		MyClassA my1 = new MyClassA();
		MyClassAB my2 = new MyClassAB();
		
		
		// 1. 인터페이스로는 객체 생성 불가
		// 2. 인터페이스 타입으로 객체를 참조		
		// (인터페이스는 '추상메소드'라는 규칙으로 이것을 구현한 클래스는 하나의 타입으로 묶을 수 있습니다.)
		InterfaceA ia1 = new MyClassA();
		InterfaceA ia2 = new MyClassAB();
		
		InterfaceB ib1 = new MyClassAB();
//		InterfaceB ib2 = new MyClassA();		// MyClassA에는 InterfaceB가 구현되있지 않음 - 오류
		InterfaceB ib2 = new MyClassC(); 
		
		InterfaceA[] aas = new InterfaceA[3];
	}

}
