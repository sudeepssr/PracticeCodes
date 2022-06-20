package topic01_recursion;

import java.util.Scanner;

public class Tut02_backtracking1toN {
	
	public static void backtracking(int i, int n) {
		
		if(i< 1) {
			return;
		}
		
		backtracking(i-1, n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		backtracking(n, n);
		sc.close();
	}
}
