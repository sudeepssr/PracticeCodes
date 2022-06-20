package topic01_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tut07_print1stSubsequenceWhoseSum_k {
	
	public static boolean subsequences(int i, int n, int sum, int add, int[] arr, List<Integer> list) {
		
		
		if(i== n) {
			if(list.size()> 0) {
				//if condition is satisfied
				if(add== sum) {
					System.out.println(list);
					return true;
				}
				
				//if condition is not satisfied
				else { 
					return false;
				}
			}
			
		}
		
		list.add(arr[i]);
		add+= arr[i];
		//method to prevent going into future recursion calls if we have already got the  answer
		if( subsequences(i+1, n, sum, add, arr, list) == true ) {
			return true;
		}
		
		list.remove(list.size()-1);
		add-= arr[i];
		//method to prevent going into future recursion calls if we have already got the  answer
		if( subsequences(i+1, n, sum, add, arr, list) == true ) {
			return true;
		}
		
		return false;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int sum= sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		ArrayList<Integer> list= new ArrayList<>();
		
		subsequences(0, n, sum, 0, arr, list);
		
		sc.close();
	}
}
