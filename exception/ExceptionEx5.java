package org.java.exception;

import java.util.Scanner;

public class ExceptionEx5 {
	public static void main(String[] args) {

		System.out.println("Exception");

		// Exception e = ��� ���ܸ� ó��
		System.out.println("���ڸ� �Է��ϼ���");
		int num1 = 10;
		int[] arrInt = new int[5];
		Scanner scn = new Scanner(System.in);

		try {
			int num2 = scn.nextInt(); // ���� �Է�
			System.out.println(num2);
			System.out.println(num1 / num2); // 0�� �Է����� ��
			System.out.println(arrInt[5]); // �迭 ����
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("�⺻ ����");
		}
		System.out.println("���α׷� �׻� ����");

		scn.close();
	}
}
