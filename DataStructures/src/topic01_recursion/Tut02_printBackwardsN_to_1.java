package topic01_recursion;

import java.util.Scanner;

public class Tut02_printBackwardsN_to_1 {
	
	public static void printBackwards(int n) {
		
		if(n< 1) {
			return;
		}
		System.out.println(n);
		printBackwards(n-1);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		printBackwards(n);
		sc.close();
	}
}
