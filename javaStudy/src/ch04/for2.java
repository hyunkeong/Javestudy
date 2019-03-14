package ch04;

public class for2 {
	public static void main(String[] args) {
		// 중첩 반복문
		// 구구단
		
	
		for(int x = 2; x <= 5; x++) {
		for(int y = 1; y <= 9; y++) {
			 System.out.print(
					 x + " * " + y + " = " + (x * y) + "\t");
			 		 
//			 System.out.println(); 줄바꿈
		
			 
		}
			 System.out.println("\n");                            
			
		}
	}
}

//for (int a = 1; a <= 3; a++);
//for(int b = 1; b <= 2; b++) {
//	// 1 1 , 1 2 , 2 1 , 2 2 , 3 1, 3 2
//	// 앞 숫자는 a고 뒤 숫자는 b임
//	
//	System.out.println(a + ", " + b);
