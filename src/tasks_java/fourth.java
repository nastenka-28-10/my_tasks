package tasks_java;
import java.util.Scanner;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.*;

public class fourth {
	public static void main(String args[]){
		System.out.println("Choose a type of your stream:"+"\n"+"1- int"+"\n2- double"+"\n3- word"+"\n4- string");
		Scanner choose=new Scanner(System.in);
		int type=1;
		if(choose.hasNextInt()){type= choose.nextInt();} else
			System.out.println("You have entered not int value!");
		
		Scanner ReadStream = new Scanner(System.in);
		switch(type){
		case 1: 
			MakeIntStream(ReadStream).forEach(System.out::println);
			break;
		case 2:
			MakeDoubleStream(ReadStream).forEach(System.out::println);
			break;
		case 3:
			MakeWordStream(ReadStream).forEach(System.out::println);
			break;
		case 4:
			MakeStringStream(ReadStream).forEach(System.out::println);
			break;		
		}
				
	}
	public static IntStream MakeIntStream(Scanner sc){
		IntSupplier IntOnly = ()-> {
            while(!sc.hasNextInt()&&sc.hasNext()){
            	sc.next();
            }
            if(sc.hasNextInt()) {
            	return sc.nextInt();
            }else
			return 0;
        };
		System.out.print("Enter int values: ");
		IntStream stream =IntStream.generate(IntOnly);		
		return stream;
	}
	public static DoubleStream MakeDoubleStream(Scanner sc){
		DoubleSupplier DoubleOnly = ()->{
            while(!sc.hasNextDouble()&&sc.hasNext()){
            	sc.next();
            }
            if(sc.hasNextDouble()) {
            	return sc.nextDouble();
            } else
			return 0;                    
        };
		System.out.print("Enter double values: ");
		DoubleStream stream =DoubleStream.generate(DoubleOnly);		
		return stream;
	}
	public static Stream<String> MakeWordStream(Scanner sc){
		System.out.print("Enter your words: ");
		Stream<String> stream =Stream.generate(() -> sc.next());		
		return stream;
	}
	public static Stream<String> MakeStringStream(Scanner sc){
		System.out.print("Enter your string: ");
		Stream<String> stream =Stream.generate(() -> sc.nextLine());		
		return stream;
	}
}
