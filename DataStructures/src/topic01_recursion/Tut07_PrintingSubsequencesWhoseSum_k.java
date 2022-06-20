package topic01_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Tut07_PrintingSubsequencesWhoseSum_k {
	
	public static void subsequences(int i, int add, int sum, int n, int arr[], ArrayList<Integer> list) {
		
		if(i>= n) {
			if(list.size() >= 0) {
				if(add== sum) {
					System.out.println(list);
					
				}
			}
			return;	
			
		}
		
		list.add(arr[i]);
		add+= arr[i];
		subsequences(i+1, add, sum, n, arr, list);
		
		list.remove(list.size()-1);
		add-= arr[i];
		subsequences(i+1, add, sum, n, arr, list);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int sum= sc.nextInt();
		int[] arr= new int[n];
		
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		ArrayList<Integer> list= new ArrayList<>();
		subsequences(0, 0, sum, n, arr, list);
		
		sc.close();
	}
}
