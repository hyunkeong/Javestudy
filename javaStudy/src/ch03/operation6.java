package ch03;

import java.util.Scanner;

public class operation6 {

	public static void main(String[] args) {

		// �� ���� (����)�Է�
		Scanner s = new Scanner(System.in);
		System.out.println("�ȳ��ϼ���");
		String txt = s.next();
		System.out.println(txt);
		// 0123
		// abcd
		
		// ������ ù���� ���ڸ� char�� ��������
		char txt2 = txt.charAt(1);

		// �Էµ� ���ڰ� ��� �´� �� �˻�
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z' || txt2 >= 'A' && txt2 <= 'Z';

		// ���
		System.out.println(isCorrect);
	}
}