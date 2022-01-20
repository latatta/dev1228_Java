package test;

import koreait.day16.KakaoMini;
import koreait.day16.KakaoVIP;

public class CreditCardTest {

	public static void main(String[] args) {
		// KakaoMini 카드 객체 생성 - 이름 "모모", 한도 5만원
		KakaoMini momo = new KakaoMini("모모");
		System.out.println("현재 한도 : " + momo.getLimit());
		momo.upLimit(50000);
		System.out.println(momo);
		System.out.println("================================================");
		
		// KakaoVIP 카드 객체 생성 - 이름 "사나", 한도 200만원
		KakaoVIP sana = new KakaoVIP("사나", 2000000);
		System.out.println(sana);
		System.out.println("================================================");
		
		System.out.println("모모 학생이 점심 돈까스 : 5000원 사용");
		momo.pay(5000);
		System.out.println(momo);
		
		System.out.println("\n사나가 스마트tv 구매 : 50만원 사용");
		sana.pay(500000);
		System.out.println(sana);
		
		System.out.println("\n사나가 냉장고 구매 : 550만원 사용");
		sana.pay(5500000);
		System.out.println(sana);
		
		System.out.println("\n모모 학생이 스마트폰 구매 : 20만원 사용");
		momo.pay(200000);
		System.out.println(momo);
		
	}

}
