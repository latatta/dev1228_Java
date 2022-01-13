package koreait.day11;

public class ShapeTest {

	public static void main(String[] args) {
		
		Triangle tri = new Triangle("삼각형", 23, 45);
		
		tri.print();	// 1) 자식이 만든 메소드
		System.out.println("넓이 : " + tri.getArea());	// 2) 부모가 물려준 메소드
		System.out.println("넓이 : " + tri.getAreaDouble());
		System.out.println("기타정보 : " + tri.etc);
		System.out.println("count : " + tri.count);
	}

}
