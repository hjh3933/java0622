package org.java.exception;

public class ExceptionThrow {
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("���� ���� �߻�");
			throw e;
		} catch(Exception e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("���ܸ� ������");
		}
	}
}
