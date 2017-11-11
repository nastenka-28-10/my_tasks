package tasks_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class sixth{
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(
	            new FileReader("C:\\Users\\Anastasia\\Desktop\\openmp.txt"));            
		char c=args[0].charAt(0);
		int number = CountSymbol(reader, c);
	System.out.println(c+": "+number);
	}	
	
	public static int CountSymbol(BufferedReader reader, char c) throws IOException{
		 int result=0;
		 String line;
         while ((line = reader.readLine()) != null){
	         for(char element : line.toCharArray()){
	        	 if (element == c) result++;
	         }
         }
         return result;
	}
}
		
			


