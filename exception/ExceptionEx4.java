package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
	public static void main(String[] args) {

		System.out.println("Exception");

		System.out.println("���ڸ� �Է��ϼ���");
		int num1 =10;
		int[] arrInt = new int[5];
		Scanner scn = new Scanner(System.in);
		
		try {
			int num2 = scn.nextInt();	//���� �Է�
			System.out.println(num2);	
			System.out.println(num1/num2);	//0�� �Է����� ��
			System.out.println(arrInt[5]);	//�迭 ����
			System.out.println("OK");
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		} catch (InputMismatchException e2) {
			e2.printStackTrace();
		} finally {
			System.out.println("�⺻ ����");
		} 
		System.out.println("���α׷� �׻� ����");
		
		scn.close();
	}
}
