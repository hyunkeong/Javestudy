package ch04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class PickMe {

	public static void main(String[] args) throws Exception { 
		BufferedReader reader = new BufferedReader(new FileReader("data/student.txt"));
		ArrayList<String> candidate = new ArrayList<>();
				
		String buffer;
		while( (buffer = reader.readLine()) != null ) {
			System.out.println("ÈÄº¸: " + buffer);			
			candidate.add(buffer);
		}
		
		Collections.shuffle(candidate);
				
		for(int index = 0; index < candidate.size(); index++)
			System.out.println((index + 1) + ": " + candidate.get(index));		
		
		reader.close();
	}
}