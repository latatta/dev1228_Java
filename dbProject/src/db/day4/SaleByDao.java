package db.day4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day1.OracleConnectUtil;
import db.vo.SaleByCustom;

public class SaleByDao {
	private static SaleByDao saleDao = new SaleByDao();

	private SaleByDao() {
	}

	public static SaleByDao getSaleByDao() {
		return saleDao;
	}

	public static List<SaleByCustom> selectByCustnoAll() {
		// SELECT * FROM V_BY_CUSTOM
		Connection conn = OracleConnectUtil.connect();
		String sql = "SELECT * FROM V_BY_CUSTOM";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<SaleByCustom> customs = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // select

			while (rs.next()) {
				SaleByCustom vo = new SaleByCustom();
				customs.add(vo);
				vo.setCustno(rs.getInt(1));
				vo.setCustname(rs.getString(2));
				vo.setAgrade(rs.getString(3));
				vo.setAsum(rs.getInt(4));
			}
			pstmt.close();

		} catch (SQLException e) {
			System.out.println("SQL 실행 오류 : " + e.getMessage());
		}

		OracleConnectUtil.close(conn);
		return customs;
	}
	
	
}
