package koreait.day10;

public class MyClass1Test {

	public static void main(String[] args) {
		MyClass1 cls1 = new MyClass1();
		
//		Scanner sc = new Scanner();		// 오류 : Scanner클래스는 기본생성자 허용 x
		String str = new String();		// 기본생성자 실행을 허용하는 클래스
		
		MyClass1 cls2 = new MyClass1(99);
		System.out.println("f1만 초기화");
		cls2.print();
		
		MyClass1 cls3 = new MyClass1("Momo");
//		MyClass1 cls33 = new MyClass1(3.14);	// 오류 : 인자의 데이터타입과 맞는 커스텀 생성자 없음
		System.out.println("f2만 초기화");
		cls3.print();

		double[] test = new double[4];
		MyClass1 cls4 = new MyClass1(test);
		System.out.println("f3만 초기화");
		cls4.print();
		
		MyClass1 cls5 = new MyClass1(999, "momo", test);
		System.out.println("모든 필드 초기화");
		cls5.print();
		
		cls4.f3[2] = 999.9912;
		System.out.println("cls5 객체 f3[2] 값 확인 : " + cls5.f3[2]); 	// cls4와 cls5 객체에서 f3필드는 동일한 배열(주소가 같음)
		System.out.println("cls5 객체 f3[0] 값 확인 : " + cls5.f3[0]);
	}

}
