package topic01_recursion;

import java.util.Scanner;

public class Tut02_printLinearlyfrom1toN {
	
	public static void printLinearly(int i, int n ) {
		
		if(i > n) {
			return;
		}
		
		System.out.println(i);
		printLinearly(i+1, n);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		printLinearly(1, n);
		
		sc.close();
		
		
	}
}
