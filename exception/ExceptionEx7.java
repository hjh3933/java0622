package org.java.exception;

public class ExceptionEx7 {
	public static void main(String[] args) {

		System.out.println("Exception");
		//Ŭ���� �˻�, ClassNotFoundException
		
		String driver = "oracle.jdbc.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println(" Oracle Driver ok");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println(" Oracle Driver no");
		}
		System.out.println("�������");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(" Oracle Driver ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" Oracle Driver no");
		}
		System.out.println();	//��ġ�ؼ� ���� ����
		
		//mysql JDBC�˻�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" mysql Driver ok ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" mysql Driver no ");
		}	//���� ��ġ ���ؼ� ���� �߻�
	}
}
