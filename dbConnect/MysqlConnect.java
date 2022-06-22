package org.project.dbConnect;

public class MysqlConnect {
	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";

		// mysql JDBC°Ë»ç
		try {
			Class.forName(driver);
			System.out.println("Driver ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no ");
		}
	}
}
