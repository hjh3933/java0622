package org.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {
	public static void main(String[] args) {

		System.out.println("Exception");

		System.out.println("������ �Է�");
		Scanner sn = new Scanner(System.in);
		
		try {
			int num = sn.nextInt();
			System.out.println(num);
			System.out.println("���� Ok");	//���ڿ� �Է½� ���� �߻� 
		} catch(InputMismatchException e) {
			e.getMessage();
		} finally {
			System.out.println("���� �߻� ��� ���� ����");
		}
		sn.close();
		System.out.println("���α׷� ����");

	}
}
