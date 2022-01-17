package koreait.day13;

import java.util.TreeMap;

// ArrayList : 순차적(인덱스로 접근) 으로 데이터를 관리하는 자료구조. 배열과 유사함
// HashMap : 순차적인 구조가 아님. 인덱스 대신 Key 값을 이용하여 데이터에 접근하여 저장/읽기
// 			검색이 많은 알고리즘에 유용함
// 위의 2개 모두 클래스는 제너릭 타입 <> 기호 안에 표시. HashMap은 K:Key, V:Value 한쌍
// 		제너릭 타입은 int, long, double 기본형 타입 대신에 래퍼(wrapper)클래스로 표기

public class HashMapTest {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<>();
		// Key: String 타입, Value: Integer 타입
		
		TreeMap<String, Integer> map = new TreeMap<>();		// key값으로 오름차순 정렬이 가능한 Map
		
		// 1. 데이터 저장
		map.put("돼지국밥", 9000);
		map.put("스파게티", 13000);
		map.put("불고기", 15000);
		map.put("곱창전골", 10000);
		map.put("백반", 7000);

		System.out.println(map); // toString 오버라이딩 되있습니다.

		// 2. 데이터 읽어오기
		System.out.println("Key: 곱창전골의 가격 " + map.get("곱창전골"));
		System.out.println("Key: 삼겹살의 가격 " + map.get("삼겹살"));

		// Key값으로 가져올 값이 없으면 null로 표기됨
		String key = "백반";
		System.out.println("Key: "+ key + "의 가격 = " + map.get(key));
		
		map.put("돼지국밥", 8000);		// 실행결과 : value 변경
		System.out.println(map);	// 			ㄴ Map은 key가 index 역할을 하기 때문	
									// 			ㄴ key값은 유일 - 중복 불가능
		
		map.remove("불고기", 10000); 			// 인자, 리턴형식 : Object -> 모든 타입
		// Key, value가 모두 일치해야만 삭제
		System.out.println("삭제 결과 : " + map);
		map.remove("불고기", 15000);
		System.out.println("삭제 결과 : " + map);
		
		int temp = map.remove("백반");
		System.out.println("remove int 리턴값 : " + temp);
		System.out.println("삭제 결과 : " + map);
		
	}

}
