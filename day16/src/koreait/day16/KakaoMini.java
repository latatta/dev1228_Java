package koreait.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard {
	// 시나리오 : 카카오미니는 학생용 카드. 한도 최대금액 있습니다. 이용한도 있습니다.
	
	public static final int MAX_LIMIT = 100000;			// 한도 최대금액
	// static final 이 상수를 뜻하는 의미로 많이 쓰임
	
	public KakaoMini(String owner) {
//		super();		// 에러 - 부모클래스에서 기본생성자를 만들지 않았음
		super(owner);
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		
		return owner + "님, 이번달 결제예정금액 " + df.format(getPayTotal()) 
		+ "원 입니다.\n[이용한도 " + df.format(getLimit()) + "원]";
	}

	@Override
	public int upLimit(int plus) {
		if ((limit + plus) > MAX_LIMIT) 	return 0;
		
		limit += plus;
		return plus;

	}

	@Override
	public int pay(int money) {
		if ((money + payTotal) > getLimit()) 	return 0;

		payTotal += money;
		return money;
	}

}
