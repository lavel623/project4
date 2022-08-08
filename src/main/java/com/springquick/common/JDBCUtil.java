package com.springquick.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	public static Connection getConnection() {
		try {
			final String DBURL = "jdbc:mysql://localhost:3306/board?useUnicode=true&serverTimezone=Asia/Seoul";
		    final String ID = "root";
		    final String PW = "1234";
		    
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(DBURL, ID, PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  null;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		if (stmt != null) {
			try {
				if (!stmt.isClosed()) stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				stmt = null;
			}
		}
		
		if (conn != null) {
			try {
				if (!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
	
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				if (!rs.isClosed()) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		
		close(stmt, conn);
	}
}
