package org.project.dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracledbConnect {
	public static void main(String[] args) {

		// Oracle JDBC ����̹� ����

		Connection conn = null; // Ŀ�ؼ� ��ü

		String driver = "oracle.jdbc.OracleDriver";
//				String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // DB���
		String user = "system"; // DB�����
		String password = "1234"; // DB���

		try {
			Class.forName(driver);
			System.out.println("Oracle Driver OK");// Ok�� ����
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Oracle DB ���� OK");// Ok�� ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver���� No");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB ���� No");
		}
	}

}
