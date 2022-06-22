package org.java.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {

		System.out.println("Exception");

		int[] arrInt = new int[5];

		try {
			for (int i = 0; i < 6; i++) {	//4번지 까지인 배열의 5번지 값을 할당 시도
				arrInt[i] = i;
				System.out.println(arrInt[i]);
			}
			//예외 발생 시 실행 안됨
			System.out.println("실행 OK");
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외처리 실행, 배열 관련
			e.printStackTrace();
		} finally {
			System.out.println("예외처리 상관없이 실행");
		}
		System.out.println("프로그램 항상 실행");

	}
}
