package koreait.day16;

public class CreditCardTest {

	public static void main(String[] args) {
		
		KakaoMini km = new KakaoMini("홍길동");
		
		km.upLimit(1000);
		System.out.println(km);
		
		km.pay(1000);
		System.out.println(km);
	}

}
