package koreait.day16;

public abstract class CreditCard {
	
	// **부모클래스는 자식클래스가 사용하도록 protected로 합니다.
	protected String owner;
	protected int limit, payTotal;
	
	public CreditCard(String owner) {
		this.owner = owner;
	}
	
	public abstract int upLimit(int plus);
	
	public abstract int pay(int money);
	
	
	public int getLimit() {
		return limit;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public int getPayTotal() {
		return payTotal;
	}
	
}
