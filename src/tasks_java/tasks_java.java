package tasks_java;
import java.lang.Math;

public class tasks_java {
	public static void main(String args[]){
		System.out.println("gcd by %: "+gcd_euclid(20,-42)+"\n");
		System.out.println("gcd by floorMod: "+gcd_euclid_floorMod(20,-42)+"\n");
		System.out.println("gcd by rem: "+gcd_euclid_rem(20,-42)+"\n");
		
	}
	public static int gcd_euclid(int a, int b){
		if(b == 0) return a;
		return gcd_euclid(b, a%b);
	}
	
	public static int gcd_euclid_floorMod(int a, int b){
		if(b == 0) return a;
		return gcd_euclid_floorMod(b, Math.floorMod(a, b) );	
	}
	
	public static int gcd_euclid_rem(int a, int b){
		if(b == 0) return a;
		return gcd_euclid_rem(b, rem(a, b));
	}
	
	
	public static int rem(int a, int b){
        if (b < 0) {
            return rem(a, -b);
        }
        if (a < 0) {
            if (rem(-a, b) != 0)
            return b - rem(-a, b);
        }
        return a%b;
	}

}	