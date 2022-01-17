package koreait.day13;

public class AbstractTest {

	public static void main(String[] args) {
//		Ashape ash = new AShape();		// 추상클래스는 new 로 객체 생성 불가 -> 오류
		
		AShape tri = new ATriangle();
		tri.setShapeName("작은 삼각형1");

		ATriangle atri = (ATriangle) tri;
		atri.setWidth(40);
		atri.setHeight(20);
		
		System.out.println("넓이1 : " + tri.getArea());		// 부모클래스의 추상메소드 -> 자식클래스의 구체화된 메소드 실행
		System.out.println("넓이2 : " + atri.getArea());
		
		// 새로 만든 triangle() 메소드는 어떤 참조변수로 실행할까요? -> atri, 자식 클래스에 있는 메소드기 때문
		System.out.println("테스트 메소드 실행 : " + atri.triangle());
		
		AShape square = new ASquare();
		square.setShapeName("중간정사각형");
		ASquare asq = (ASquare) square;
		asq.setWidth(20);
		System.out.println("테스트 메소드 실행 : " + asq.square());
		
		System.out.println("넓이1 : " + square.getArea());		// 부모클래스의 추상메소드 -> 자식클래스의 구체화된 메소드 실행
		System.out.println("넓이2 : " + asq.getArea());
		
		

	}
}
