package org.java.exception;

public class Ex1 {
	// 예외가 생길것을 예상하고 미리 던짐
	public void calculator() throws ArithmeticException {
		int num = 100;
		int rs = num / 0;
		System.out.println("정상실행1"); // 안보여
	}

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		try {
			ex1.calculator();
		} catch (ArithmeticException e) {
			e.printStackTrace();// 무슨 오류인지 알려줌
		}
		// 위에서 예외 던지고 실행하는 곳에서 try-catch문 사용하기
		System.out.println("정상실행2");
	}

}
