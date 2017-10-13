package tasks_java;

import java.math.BigInteger;
import java.util.stream.Stream;

public class eighth {
	public static void main(String args[]){
		BigInteger a = BigInteger.valueOf(25214903917L);
		BigInteger c = BigInteger.valueOf(11);
		BigInteger m = BigInteger.valueOf((long) Math.pow(2,48));
		
		Stream<BigInteger> random_values = Stream.iterate(BigInteger.ZERO, x_n->RandomGenerate(a,c,m,x_n)).limit(50).skip(2);
		random_values.forEach(System.out::println);
	}
	public static BigInteger RandomGenerate(BigInteger a, BigInteger c, BigInteger m, BigInteger seed){
		return  ((a.multiply(seed)).add(c)).mod(m);
	}
}
