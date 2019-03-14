package ch03;

public class Exam03_09 {
	public static void main(String[] args) {
		//대문자를 소문자로 변경 (소문자가 대문자보다 32만큼 더 큼, A의 코드 65 / a의 코드 97)
		
		char ch = 'T';
		 char lowerCase = 
				 ( ch > 'A' && ch < 'Z' /* A 보다 크고 Z 보다 적은 경우 */ ) 
				 ? ( (char)(ch + 32)/* ch + 32 */ ) 
				 : ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
