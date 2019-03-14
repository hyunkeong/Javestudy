package ch03;

public class Exam03_05 {
	
	public static void main(String[] args) {
		
		//일의 자리 숫자를 1로 변경 (333 => 331 777 => 771)

		int num = 333;
		int n1 = num % 100;
				
		 System.out.println( (n1*10) + 1); // 나누기, 곱하기 연산자 이용
	}

}
