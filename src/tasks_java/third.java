package tasks_java;

import java.lang.Math;
import java.util.Scanner;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;

public class third {
	public static void main(String args[]){
		Scanner ReadNumber = new Scanner(System.in);
		System.out.print("Enter your number in hex: ");
		String number = ReadNumber.nextLine();
		number = number.replaceAll(" ", "");
		number=number.replaceAll("[^a-fA-F0-9]","" );
		System.out.println("The entered number: "+number);
		System.out.println("The decimal number: "+ToDecimal(number));
	}
	public static int ToDecimal(String InputString){
		int Result=0;
		int k=0;
		for (int i=InputString.length()-1;i>=0;i--){
			char c = InputString.charAt(i);
			if ((c=='A') || (c=='a')) Result+=10*Math.pow(16,k);
			else if ((c=='B') || (c=='b')) Result+=11*Math.pow(16,k);
			else if ((c=='C') || (c=='c')) Result+=12*Math.pow(16,k);
			else if ((c=='D') || (c=='d')) Result+=13*Math.pow(16,k);
			else if ((c=='E') || (c=='e')) Result+=14*Math.pow(16,k);
			else if ((c=='F') || (c=='f')) Result+=15*Math.pow(16,k);
			else{
				int IntC = Character.digit(c, 10);
				Result+=IntC*Math.pow(16, k);
			}
			k++;
		}
		return Result;
	}
}



