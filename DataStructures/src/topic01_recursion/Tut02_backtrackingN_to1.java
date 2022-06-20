package topic01_recursion;

import java.util.Scanner;

public class Tut02_backtrackingN_to1 {
	
	public static void backtracking(int i, int n) {
		
		if(i> n) {
			return;
		}
		
		backtracking(i+1, n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		backtracking(1 ,n);
		sc.close();
	}
}
