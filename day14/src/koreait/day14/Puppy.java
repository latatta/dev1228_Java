package koreait.day14;

public class Puppy extends Animal {

	static final String TYPE = "강아지";
	
	public Puppy() {
		
	}
	
	public Puppy(String name, String color) {
		super(name, color);
		
	}

	@Override
	public void sound() {
		System.out.println("강아지는 멍멍하고 짖습니다.🐶🐶🐶");
	}

	@Override
	public String toString() {
		return super.toString() + " - Type : " + TYPE;		// super는 Animal클래스 toString
	}
	
	
	

}
