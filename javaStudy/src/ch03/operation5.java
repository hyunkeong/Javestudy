package ch03;

public class operation5 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result = false;

		result = num1++ < 0 && num2++ > 0;
			System.out.println("result : " + result);
			System.out.println("num1 : " +
					 num1 + ", num2 : " + num2);
	}
}