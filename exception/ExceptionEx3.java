package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {

		System.out.println("Exception");

		System.out.println("정수를 입력");
		Scanner sn = new Scanner(System.in);
		
		try {
			int num = sn.nextInt();
			System.out.println(num);
			System.out.println("실행 Ok");	//문자열 입력시 예외 발생 
		} catch(InputMismatchException e) {
			e.getMessage();
		} finally {
			System.out.println("예외 발생 상관 없이 실행");
		}
		sn.close();
		System.out.println("프로그램 정상");

	}
}
