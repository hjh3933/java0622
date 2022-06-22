package org.java.exception;

public class ExceptionThrow {
	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("예외 고의 발생");
			throw e;
		} catch(Exception e1) {
			e1.printStackTrace();
		} finally {
			System.out.println("예외를 던졌다");
		}
	}
}
