package koreait.day13;

public class AbstractTest2 {

	public static void main(String[] args) {
		// 추상클래스 타입으로 배열을 선언하고 자식클래스 객체를 참조하는 예제입니다.
		
		AShape[] shapes = new AShape[3];		// ArrayList 사용도 가능
		
		shapes[0] = new ATriangle();
		shapes[1] = new ASquare();
		shapes[2] = new ATriangle();
		
//		ATriangle t = (ATriangle) shapes[1];		// 오류발생 : 만들어진 객체외 다른 타입으로 캐스팅 불가
		ATriangle s = (ATriangle) shapes[2];		// 정상실행 : 만들어진 객체와 참조타입이 일치
		
		for (int i = 0; i < shapes.length; i++) {
			ATriangle at;
			ASquare as;
			
			if (shapes[i] instanceof ATriangle) {		// shapes[i]가 참조하는 객체가 ATriangle 객체인지 검사	: instanceof 연산자
				 at = (ATriangle) shapes[i];
				 at.setHeight(100);
				 at.setWidth(50);
				 System.out.println(at.triangle());
				 
			} else if (shapes[i] instanceof ASquare) {		// shapes[i]가 참조하는 객체가 ASquare 객체인지 검사 : instanceof 연산자
				as = (ASquare) shapes[i];
				as.setWidth(90);
				System.out.println(as.square());
			}
			double temp = shapes[i].getArea();
			System.out.println("넓이 shapes[" + i + "] : " + temp);
		}
	}
}
