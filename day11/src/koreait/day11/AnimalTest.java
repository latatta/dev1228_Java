package koreait.day11;

public class AnimalTest {

	public static void main(String[] args) {
		
		Puppy puppy = new Puppy();
		
		puppy.sound();
		puppy.setType("poodle");
		System.out.println(puppy.getType());
		
		Cat cat = new Cat();
		cat.setName("네로");
		cat.sound();
	}

}
