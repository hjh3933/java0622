package org.java.exception;

import java.util.Scanner;

public class ExceptionEx5 {
	public static void main(String[] args) {

		System.out.println("Exception");

		// Exception e = 모든 예외를 처리
		System.out.println("숫자를 입력하세요");
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner scn = new Scanner(System.in);

		try {
			int num2 = scn.nextInt(); // 문자 입력
			System.out.println(num2);
			System.out.println(num1 / num2); // 0을 입력햇을 때
			System.out.println(arrInt[5]); // 배열 오류
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("기본 실행");
		}
		System.out.println("프로그램 항상 실행");

		scn.close();
	}
}
