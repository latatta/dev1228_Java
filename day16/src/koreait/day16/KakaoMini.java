package koreait.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard {

	public final int MAX_LIMIT = 100000;

	DecimalFormat df = new DecimalFormat("###,###,###,###");

	public KakaoMini(String owner) {
		super(owner);
	}

	@Override
	public String toString() {
		return owner + "님, 이번달 결제예정금액 " + df.format(getPayTotal()) 
		+ "원 입니다.\n[이용한도 " + df.format(getLimit()) + "원]";
	}

	@Override
	public int upLimit(int plus) {
		if ((getLimit() + plus) > MAX_LIMIT) {
			return 0;
		}
		limit += plus;
		return plus;

	}

	@Override
	public int pay(int money) {
		if ((money + getPayTotal()) > getLimit()) {
			return 0;
		}
		payTotal += money;
		return money;
	}

}
