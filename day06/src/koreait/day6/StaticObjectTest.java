package koreait.day6;

public class StaticObjectTest {		// VariableTest 클래스의 필드 성질을 확인하는 연습

	public static void main(String[] args) {
		
		System.out.println(VariableTest.fval2);		// 1번
		
		VariableTest obj = new VariableTest();		// obj는 객체를 참조하는 변수
		System.out.println(obj.dval);				// 2번
		
		obj.nonstatic(0);							// 2번
		
		// 1. 클래스이름.메소드 또는 클래스이름.필드 일때는 메소드와 필드는 static
		// 2. 객체(Object).메소드 또는 객체.필드 일때는 메소드와 필드가 static이 아닌것을 사용합니다.
		// 						(static도 사용할 수 있지만, 이때는 1번과 같이 사용하는게 좋습니다.)
	}

}
