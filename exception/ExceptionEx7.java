package org.java.exception;

public class ExceptionEx7 {
	public static void main(String[] args) {

		System.out.println("Exception");
		//클래스 검색, ClassNotFoundException
		
		String driver = "oracle.jdbc.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println(" Oracle Driver ok");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println(" Oracle Driver no");
		}
		System.out.println("정상실행");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(" Oracle Driver ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" Oracle Driver no");
		}
		System.out.println();	//설치해서 오류 없다
		
		//mysql JDBC검사
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" mysql Driver ok ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no ");
		}	//아직 설치 안해서 오류 발생
	}
}
