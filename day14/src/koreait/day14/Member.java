package koreait.day14;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("새로운 회원 " + this.name + "님 환영합니다.");
	}
	
	// 회원이 분양받습니다. 회원 나이 강아지는 15세 이상, 고양이는 18세 이상, 토끼는 13세 이상 분양받을 수 있습니다.
	boolean isAdopt(Animal animal) {	// Animal 자식클래스 Puppy, Cat, Rabbit 객체가 animal변수로 참조하게 됩니다.
		// 현재 회원객체가 인자로 전달받은 animal 객체를 분양받을 수 있는지 반환합니다.
		if (animal instanceof Puppy && this.age >= 15) return true;
		else if (animal instanceof Cat && this.age >= 18) return true;
		else if (animal instanceof Rabbit && this.age >= 13) return true;
		else return false;
		
		
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}
