package ch04;

public class Exam4_1 {
	public static void main(String[] args) {
		int workingTime = 10; // 근무시간

		// 코드 작성
		// workingTime 이 8 이상이면 퇴근
		if (workingTime >= 8) {
			System.out.println("퇴근");
		} else if (workingTime < 8) {
			System.out.println("계속근무");
		}

	}

}
