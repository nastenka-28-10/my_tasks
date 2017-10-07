package tasks_java;

public class second {

	public static void main(String args[]){
		String InputString="";
		for (int i=0; i<args.length;i++){
			InputString+=args[i]+" ";
		}
		InputString=InputString.trim();
		
		String Result=ROT13(InputString);
		System.out.print("Your string: ");
		System.out.println(InputString);
		System.out.print("Code string: ");
		System.out.println(Result);
		System.out.print("Decode string: ");
		System.out.println(DecodeROT13(Result));
	}
	public static String DecodeROT13(String InputString){
		return ROT13(InputString);		
	}
	public static String ROT13(String InputString){
		char[]InputArr=InputString.toCharArray();
		for (int i = 0; i < InputString.length(); i++) {
            char c = InputString.charAt(i);           
            if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
            InputArr[i]=c;	                
        }
		InputString=String.copyValueOf(InputArr);
		return InputString;
	}
}
