package topic01_recursion;

import java.util.Scanner;

public class Tut05_fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n<= 1) {
			return n;
		}
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The " +n+"( nd/th ) fibonacci no is : "+ fibonacci(n) );
		
		sc.close();
	}
}
