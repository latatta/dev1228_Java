package koreait.day16_interface;


// 이 클래스는 2개의 인터페이스를 사용합니다. - 결론 : 상속은 다중상속이 불가, 인터페이스는 다중구현 가능
public class MyClassAB implements InterfaceA, InterfaceB {

	// InterfaceA의 추상메소드
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}
	
	
	// InterfaceA의 추상메소드
	@Override
	public int methodB(int num) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// InterfaceB의 추상메소드
	@Override
	public void methodBA() {
		// TODO Auto-generated method stub
		
	}
}
