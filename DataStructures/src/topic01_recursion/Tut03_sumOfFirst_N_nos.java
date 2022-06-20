package topic01_recursion;

import java.util.Scanner;

public class Tut03_sumOfFirst_N_nos {
	
	//Method01: By parameterized recursion , 
	//ie this function is not expected to return something, rather it will just print
//	public static void sumOfFirstN(int i, int n, int sum) {
//		
//		if(i> n) {
//			System.out.println(sum);
//			return;
//		}
//		sum+= i;
//		sumOfFirstN(i+1, n, sum);
//		
//	}
	
	
	
	// Method02: By functional recursion, 
	//ie: when the function will return something rather than printing it
	public static int sumOfFirstN(int n) {
		
		if(n== 0) {
			return 0;
		}
		
		
		return n+ sumOfFirstN(n-1);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println( sumOfFirstN(n) );
		
		sc.close();
	}
}
