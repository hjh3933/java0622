package org.java.exception;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {

		System.out.println("Exception");

		int num1 = 100;
		System.out.println("������ ���� �Է�");

		Scanner scn = new Scanner(System.in);
		int num2 = scn.nextInt();

		System.out.println("���� OK");

		try {
			System.out.println(num1 / num2); // 0���� ������ ���� �߻�
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("�⺻ ���๮");
		}

		System.out.println("���α׷� ���� ����"); // ������ ���ܹ߻� �� ������ �ȵ�
		
		scn.close();
	}
}
