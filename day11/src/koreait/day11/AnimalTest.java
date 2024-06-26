package koreait.day11;

public class AnimalTest {

	public static void main(String[] args) {
		
		Puppy puppy = new Puppy();
		
		puppy.sound();
		puppy.setType("poodle");
		System.out.println("puppy type : " + puppy.getType());
		
		Animal dog = new Puppy();		// 자식 객체를 부모타입으로 참조할 수 있습니다.
		
		dog.sound();
//		dog.test();			// 오류 : Puppy 로 만들어진 객체이지만 참조타입이 Animal 입니다.
		
		Puppy test = (Puppy) dog;		// 부모타입이고 Puppy 객체를 자식타입으로 강제캐스팅
		test.sound();
		test.test();					// dog변수와 test변수가 저장하는 주소는 동일합니다.
		
		
//		Puppy test = new Animal();		// 오류 : 부모객체는 자식 타입으로 참조할 수 없음
		
//		Puppy test = (Puppy) new Animal();		// Animal 객체를 자식타입으로 강제캐스팅 ->
//		test.sound();
		
		Cat cat = new Cat();
		cat.setName("네로");
		cat.sound();
		
		
	}

}
