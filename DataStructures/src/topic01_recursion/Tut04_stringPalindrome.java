package topic01_recursion;

import java.util.Scanner;

public class Tut04_stringPalindrome {
	
	public static boolean isPalindrome(int l, int n, String str) {
		if(l >= n/2) {
			return true;
		}
		if(str.charAt(l)!= str.charAt(n-l-1) ) {
			return false;
			
		}
		return isPalindrome(l+1, n, str);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		
		System.out.println("is Palindrome:"+ isPalindrome(0, str.length(), str) );
		sc.close();		
	}
}
