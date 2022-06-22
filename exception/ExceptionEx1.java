package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {

		System.out.println("Exception");

		int num1 = 100;
		System.out.println("나누는 숫자 입력");

		Scanner scn = new Scanner(System.in);
		int num2 = scn.nextInt();

		System.out.println("실행 OK");

		try {
			System.out.println(num1 / num2); // 0으로 나누면 예외 발생
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("기본 실행문");
		}

		System.out.println("프로그램 정상 실행"); // 위에서 예외발생 시 실행이 안됨
		
		scn.close();
	}
}
