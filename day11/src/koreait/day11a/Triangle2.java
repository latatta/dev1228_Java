package koreait.day11a;

import koreait.day11.Shape;

public class Triangle2 extends Shape {
	
	public Triangle2(String shapeName, int width, int height) {
		
		super(shapeName, width, height);
	}
	
	public void print() {		// getShapeName() : Shape 클래스의 필드가 private 접근자이기 때문에 getter로 가져와야함
		System.out.println("도형 이름 : " + getShapeName() + ", 너비 : " + getWidth() + ", 높이 : " + getHeight());
		System.out.println("특별한 변수 테스트 - (Triangle 메소드에서 출력)----------------------------?");
//		System.out.println("기타 정보 : " + etc);		// 다른 패키지 클래스의 기본접근자 필드는 사용 불가
		System.out.println("count : " + count);		// 다른 패키지 클래스 이지만, 자식클래스이므로 protected 필드도 사용 가능
	}
	
	public int getArea() {		// ***** 부모클래스가 정의한 형식의 메소드를 자식클래스에서 수정(변경) : 오버라이드(override) *****
		return getHeight() * getWidth() / 2;
	}
	
	public double getAreaDouble() {		// 같은 이름의 서로 다른(형식) 메소드가 있으면 오류
		return (double) getHeight() * getWidth() / 2;		
	}
	
	
	
}
