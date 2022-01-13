package koreait.day6;

import java.util.Scanner;

public class GirlGroupTest {

	public static void main(String[] args) {
		// GirlGroup 클래스 활용
		
		System.out.println("Static 필드값 확인");
		System.out.println("성별 = " + GirlGroup.GENDER);
		
		System.out.println("2. 객체 생성합니다.");
		GirlGroup brave = new GirlGroup();		// 객체생성 : 객체는 클래스의 인스턴스(복사본) 입니다.
		brave.year = 2011;
		brave.team_eng = "Brave Girls";
		brave.team_kor = "브레이브 걸스";
		brave.numbers = 4;
		brave.infoPrint();
		System.out.println("연도차 : " + brave.yearth(2022));
		
		GirlGroup aespa = new GirlGroup();
		aespa.year = 2020;
		aespa.team_eng = "aespa";
		aespa.team_kor = "에스파";
		aespa.numbers = 4;
		aespa.infoPrint();
		System.out.println("연도차 : " + aespa.yearth(2022));
		
		Scanner sc = new Scanner(System.in);
//		int year = sc.nextInt(); 		// nextInt()는 인스턴스 메소드 -> 객체참조변수, 메소드명으로 실행함.
		
		GirlGroup stacy = new GirlGroup();
		System.out.println("새로운 객체의 필드값을 입력하세요.");
		
		System.out.println("그룹명(한글) -> ");
		stacy.team_kor = sc.nextLine();		

		System.out.println("그룹명(영문) -> ");
		stacy.team_eng = sc.nextLine();
		
		System.out.println("멤버 인원 -> ");
		stacy.numbers = sc.nextInt();

		System.out.println("데뷔 년도 -> ");
		stacy.year = sc.nextInt();
// 		stacy.year = Integer.parseInt(sc.nextLine()); 	// 문자열을 정수로 변환
		
		stacy.infoPrint();
		
		sc.close();
		
	
	}

}
