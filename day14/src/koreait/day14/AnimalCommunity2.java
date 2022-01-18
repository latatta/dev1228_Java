package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Animal> animals = new ArrayList<>(); 
		
		animals.add(new Puppy("브라우니", "Brown")) ;
		animals.add(new Cat());
		animals.add(new Rabbit("바니바니", "White"));
		animals.add(new Puppy());
		
		animals.get(1).setName("냥이");
		animals.get(1).setColor("Black");

		// 회원은 반려동물 분양
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i) != null)
				System.out.println(i + " : " + animals.get(i));
		}
		
		System.out.println("[[ 우리 동물들의 소리도 들려드리겠습니다.]]");
		for (int i = 0; i < animals.size(); i++) {
			if (animals.get(i) != null) animals.get(i).sound();
		}
				
		// 분양을 원하면 회원생성을 합니다.
		Member sana = new Member("사나", 15);

		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요. -> ");
		int sel = sc.nextInt();
		System.out.println("선택하신 " +animals.get(sel) + "는 ");
		if (sana.isAdopt(animals.get(sel))) System.out.println("분양받으실 수 있습니다.");
		else System.out.println("분양받으실 수 없습니다.");
		
		sc.close();
	}

}
