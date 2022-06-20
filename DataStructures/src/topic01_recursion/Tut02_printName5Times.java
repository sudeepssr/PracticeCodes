package topic01_recursion;

import java.util.Scanner;

public class Tut02_printName5Times {
	
	public static void printName(String name, int count) {
		
		if(count> 5) {
			return;
		}
		
		System.out.println(name);
		
		printName(name, count+1);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		
		printName(name, 1);
		
		sc.close();
	}
}
