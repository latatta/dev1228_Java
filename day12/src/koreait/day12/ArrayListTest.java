package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	// java.util.ArrayList 클래스를 사용해서 배열보다 편하게 데이터를 저장/접근 - 
	public static void main(String[] args) {
		int[] datas = {1, 5, 7, 9, 11};		// 1) 배열은 선언된 해진 크기에 따라 사용해야함
											// *기본형 타입으로 선언
											// 2) 배열은 새로운 데이터를 중간 위치에 추가/삭제 할 때 for문으로 직접 코딩함
											// 3)
		
		ArrayList<Integer> intList = new ArrayList<>();		// 나중에 변수의 참조타입을 변경합니다.
									// 1) 크기는 데이터를 추가할 때마다 증가 (데이터 삭제할 때는 크기 감소)
									// *기본형 데이터는 Integer : 래퍼클래스를 사용, <>는 제너릭타입을 지정하는 기호 
									// 2) add(), remove() 메소드로 추가/삭제
									// 3) 
	// 공통점 : 배열과 동일하게 index로 위치를 표시
		
		intList.add(1);		// 데이터는 마지막 위치에 추가
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(11);
		System.out.println(intList);	// 출력결과로 ArrayList 클래스의 toString 메소드는 오버라이드 되어있습니다.
		System.out.println(datas);		// 배열변수는 참조값을 저장하지만 클래스 타입 아니고 toString() 참조주소와 관련된 값 출력
		System.out.println(Arrays.toString(datas));
		
		System.out.println("list의 크기 : " + intList.size());
		
		intList.add(2, 99);		// 2번 인덱스에 추가(변경X)
		System.out.println(intList); 
		System.out.println("list의 크기 : " + intList.size());
		
		// 삭제
		intList.remove(3);		// 인덱스 3 위치 삭제
		System.out.println(intList); 
		System.out.println("list의 크기 : " + intList.size());
		
		// 특정 인덱스 위치 값 가져오기
		int temp = intList.get(3);
		System.out.println("인덱스 3 데이터 : " + temp);
		System.out.println("인덱스 2 데이터 : " + intList.get(2));
		
		// contains 메소드
		System.out.println(intList.contains(99));
		System.out.println(intList.contains(100));
		
		// intList의 모든 값을 index = .. element = .. 로 출력
		for (int i = 0; i < intList.size(); i++) {
			System.out.println("index = " + i + ", element = " + intList.get(i));
		}
	}

}
