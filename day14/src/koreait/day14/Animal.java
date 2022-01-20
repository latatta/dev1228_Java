package koreait.day14;

public abstract class Animal {		// abstract 클래스는 abstract 메소드를 갖는 것이 일반적입니다.
									// abstract 메소드 유무와 상관없이 객체는 직접 생성 못합니다.
									// 			-> 추상메소드를 자식클래스가 구현하면 구체화됩니다.
									// 추상 클래스는 클래스의 상속에서만 다룹니다.
									// 추상클래스는 부모클래스입니다.(추상화된 상태)
									// 
	
	static final String TYPE = "아직 모름";
	
	// 필드 : 공통적인 값
	private String name;
	private String color;

	public Animal() {
		System.out.println("새로운 반려동물 가족이 태어났습니다.");
	}
	
	public Animal(String name) {
		this();		// 자기 자신 객체의 기본생성자 메소드 호출
		this.name = name;
	}
	
	public Animal(String name, String color) {
		this(name);		
		this.color = color;
	}
	
	// 추상메소드
	public abstract void sound();
	
	// Object 클래스의 toString() 메소드 오버라이드
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "] - Type : ";
		// Type 필드값을 여기서 출력하면 이 코드가 있는 Animal의 TYPE이 출력됨
		// 자식 클래스의 TYPE 필드값을 출력 안하고 Animal의 TYPE값인 '아직 모름'이 출력됨
		// 결론 : TYPE 필드는 자식클래스 toString에서 출력함
	}
	
	
	// getter, setter
	public String getColor() {
		return color;
	}
	

	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
