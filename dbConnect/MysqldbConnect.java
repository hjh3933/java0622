package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqldbConnect {
	public static void main(String[] args) {

		// mysql JDBC 드라이버 연동

		Connection conn = null; // 커넥션 객체

		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/DB명";
		String url = "jdbc:mysql://localhost:3306/world"; // DB경로
		String user = "root"; // DB사용자
		String password = "1234"; // DB비번

		try {
			Class.forName(driver);
			System.out.println("Driver OK");//Ok시 실행
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 OK");//Ok시 실행
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver연결 No");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 No");
		}

	}
}
