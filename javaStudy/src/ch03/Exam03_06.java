package ch03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {
		// ������(%) �� ������(/) �����ڸ� �̿��Ͽ� �Էµ� �� �ڸ� ���ڰ� ������ Ȯ��
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int n = scanner.nextInt();
		int ten = 0; // 10�� �ڸ� ���� ������ ����

		int one = 0; // 1�� �ڸ� ���� ������ ����
		ten = n % 10;
		
		boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
		/* ten ������ 10�� �ڸ� �� ���� */
		ten = n / 10;
		/* one ������ 1�� �ڸ� �� ���� */
		ten = n % 10;
		/* isMatch ������ �� ���� �ڸ� �� �� �� ���� */
		isMatch = ten == one;
		System.out.println(isMatch);
		scanner.close();
	}

}