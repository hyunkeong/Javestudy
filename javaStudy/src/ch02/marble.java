package ch02;

public class marble {
	public static void main(String[] args) {
		
		int num1 = 0;
		num1 = (int)(Math.random() * 6 + 1 );
		System.out.println("1번 : " + num1);
		
		int num2 = 0;
		num2 = (int)(Math.random() * 6 + 1 );
		System.out.println("2번 : " + num2);
		
		System.out.println("두 수의 합 : " + (num1 + num2) );


		
	}

}
