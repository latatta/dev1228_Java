package koreait.day11;

public class Cat extends Animal{
	
	public Cat() {
		// super()가 생략되어있음
		System.out.println("냐옹이가 생성되었습니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("🐱🐱야옹 웁니다." + getName()); 
	}
}
