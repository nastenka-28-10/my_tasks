package tasks_java;
import java.lang.Math;

public class tasks_java {
	public static void main(String args[]){
		System.out.println("gcd by %: "+gcd_euclid(-20,42)+"\n");
		System.out.println("gcd by floorMod: "+gcd_euclid_floorMod(-20,42)+"\n");
		
	}
	public static int gcd_euclid(int a, int b){
		while (a!=0 && b!=0) {
			 if (Math.abs(a)>Math.abs(b)) a %= b; else b %= a;
			}
		return (Math.abs(a)+Math.abs(b));
	}
	public static int gcd_euclid_floorMod(int a, int b){
		while (a!=0 && b!=0) {
			 if (Math.abs(a)>Math.abs(b)) a=Math.floorMod(Math.abs(a),Math.abs(b)); else b=Math.floorMod(Math.abs(b),Math.abs(a));
			}
		return (a+b);
		
	}

}	