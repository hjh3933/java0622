package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqldbConnect {
	public static void main(String[] args) {

		// mysql JDBC ����̹� ����

		Connection conn = null; // Ŀ�ؼ� ��ü

		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/DB��";
		String url = "jdbc:mysql://localhost:3306/world"; // DB���
		String user = "root"; // DB�����
		String password = "1234"; // DB���

		try {
			Class.forName(driver);
			System.out.println("Driver OK");//Ok�� ����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB ���� OK");//Ok�� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver���� No");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB ���� No");
		}

	}
}
