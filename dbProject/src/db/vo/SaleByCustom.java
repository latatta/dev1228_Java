package db.vo;

public class SaleByCustom {
	// v_by_custno view에서  select 쿼리 실행하는 메소드 정의
	
	private int custno;
	private String custname;
	private String agrade;
	private int asum;
	
	public SaleByCustom(int custno, String custname, String agrade, int asum) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.agrade = agrade;
		this.asum = asum;
	}
	
	public SaleByCustom() {
	}
	
	@Override
	public String toString() {
		return String.format("%-7s", custno) + String.format("%-10s", custname) + String.format("%-10s", agrade) + 
				String.format("%-10s", asum);
	}
	
	public int getCustno() {
		return custno;
	}


	public void setCustno(int custno) {
		this.custno = custno;
	}


	public String getCustname() {
		return custname;
	}


	public void setCustname(String custname) {
		this.custname = custname;
	}


	public String getAgrade() {
		return agrade;
	}


	public void setAgrade(String agrade) {
		this.agrade = agrade;
	}


	public int getAsum() {
		return asum;
	}


	public void setAsum(int asum) {
		this.asum = asum;
	}

	public void selectByCustno() {
		
	}
	
	
}
