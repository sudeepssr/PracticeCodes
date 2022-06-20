package topic01_recursion;

import java.util.Scanner;

public class Tut04_reverseTheArray {
	
	public static void reverseArr( int n, int[] arr, int l) {
		
		if(l >= n/2) {
			return ;
		}
		
		int t= arr[l];
		arr[l]= arr[n-l-1];
		arr[n-l-1]= t;
		
		reverseArr( n, arr, l+1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		int l= 0;
		reverseArr( n, arr, l);
		
		for(int val: arr) {
			System.out.println(val);
		}
		
		sc.close();
	}
}
