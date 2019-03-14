package ch03;

import java.util.Scanner;

public class operation6 {

	public static void main(String[] args) {

		// 한 글자 (영어)입력
		Scanner s = new Scanner(System.in);
		System.out.println("안녕하세오");
		String txt = s.next();
		System.out.println(txt);
		// 0123
		// abcd
		
		// 문장의 첫번쨰 글자를 char로 꺼내오기
		char txt2 = txt.charAt(1);

		// 입력된 글자가 영어가 맞는 지 검사
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z' || txt2 >= 'A' && txt2 <= 'Z';

		// 출력
		System.out.println(isCorrect);
	}
}