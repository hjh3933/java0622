package org.java.exception;

public class Ex1 {
	// ���ܰ� ������� �����ϰ� �̸� ����
	public void calculator() throws ArithmeticException {
		int num = 100;
		int rs = num / 0;
		System.out.println("�������1"); // �Ⱥ���
	}

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		try {
			ex1.calculator();
		} catch (ArithmeticException e) {
			e.printStackTrace();// ���� �������� �˷���
		}
		// ������ ���� ������ �����ϴ� ������ try-catch�� ����ϱ�
		System.out.println("�������2");
	}

}
