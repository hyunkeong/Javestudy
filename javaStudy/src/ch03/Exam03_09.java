package ch03;

public class Exam03_09 {
	public static void main(String[] args) {
		//�빮�ڸ� �ҹ��ڷ� ���� (�ҹ��ڰ� �빮�ں��� 32��ŭ �� ŭ, A�� �ڵ� 65 / a�� �ڵ� 97)
		
		char ch = 'T';
		 char lowerCase = 
				 ( ch > 'A' && ch < 'Z' /* A ���� ũ�� Z ���� ���� ��� */ ) 
				 ? ( (char)(ch + 32)/* ch + 32 */ ) 
				 : ch;
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}

}
