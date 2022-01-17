package koreait.day13;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// value 투표수 카운트
		System.out.println("투표합시다!!!");
		String foods = "오늘의 저녁 메뉴 : 치킨, 떡볶이, 곱창전골, 오징어물회, 불고기";
		System.out.println(foods);

		map.put("치킨", 0);
		map.put("떡볶이", 0);
		map.put("곱창전골", 0);
		map.put("오징어물회", 0);
		map.put("불고기", 0);

		while (true) {
			System.out.println("선택 메뉴 음식명 입력하세요.(종료 : end) -> ");
			String menu = sc.nextLine();
			int temp;

			if (menu.equals("end"))
				break;

			if (!map.containsKey(menu)) {	// key갑으로 없는 문자열이 입력된 경우
				System.out.println("없는 메뉴를 선택했습니다. 메뉴에 추가합니다!");
				// continue;
				map.put(menu, 1);
				foods += ", " + menu;
			} else {

				// 입력한 메뉴가 key값입니다. 해당 key의 value값을 +1 증가시키고 그 값을 map에 변경합니다.
				temp = map.get(menu);
				map.put(menu, ++temp);
				// map.put(menu, temp++); // temp값을 put 메소드에 저장 => temp +1 증가
				// -> map.put(menu, temp); temp++;

				// map.put(menu, ++temp); // temp +1 증가 => put 메소드에 temp값 저장
				// -> temp++; map.put(menu, temp);

				// 결론 : ++ 또는 -- 연산은 다른 메소드 또는 연산자 또는 출력문, ...과 같이 쓰일 때 위치에 따라 먼저 또는 나중에 실행
				// 위치에 따라 앞(전치, prefix), 뒤(후치, postfix)
			}
				System.out.println("현재 투표 상황 : " + map);

		}

		System.out.println("투표 종료");
		System.out.println("최대 득표 수 : " + Collections.max(map.values()));	// value 중에 가장 큰 값(최댓값)
		System.out.println("최대 득표 수 : " + Collections.max(map.keySet()));	// key값 정렬시 최대값(제일 마지막 key)
		
		// Collections 의 종류 : List(ArrayList), Map(HashMap, TreeMap), Set(HashSet) - 집합, 이터레이터
	}

}
