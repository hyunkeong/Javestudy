package ch04;

public class If {
	public static void main(String[] args) {
		// 주석 처리 : 범위지정후 ctrl + /

		// int score = 87; 오류!!!
//		if (score >= 60) {
//			System.out.println("D");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 90) {
//			System.out.println("A");
//		} else {
//			System.out.println("F");
//		}

		int score = 87;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
