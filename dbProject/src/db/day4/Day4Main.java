package db.day4;

import java.util.List;

import db.vo.SaleByCustom;

public class Day4Main {

	public static void main(String[] args) {
		SaleByDao saleDao = SaleByDao.getSaleByDao();
		List<SaleByCustom> list = SaleByDao.selectByCustnoAll();
				
		System.out.println(String.format("%-7s %-10s %-10s\t %-10s", "고객번호", "고객성명", "고객등급", "총매출금액"));
		
		for (SaleByCustom vo : list)
			System.out.println(vo);
		
	}

}
