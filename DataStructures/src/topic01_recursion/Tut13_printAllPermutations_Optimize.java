package topic01_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tut13_printAllPermutations_Optimize {
	
	public static void permutations(int i, int[] arr, List< List< Integer> > answer) {
		
		if(i== arr.length) {
			
			List<Integer> list= new ArrayList<>();
			for(int ind= 0; ind< arr.length; ind++) {
				list.add(arr[ind] );
			}
			
			answer.add(new ArrayList<>(list) );
			return;
		}
		
		for(int j= i; j< arr.length; j++) {
			int t= arr[j];
			arr[j]= arr[i];
			arr[i]= t;
			
			permutations(i+1, arr, answer);
			
			//Now we will again make the changes back to normal for backtracking
			int z= arr[i];
			arr[i]= arr[j];
			arr[j]= z;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		List< List<Integer> > answer= new ArrayList<>();
		
		permutations(0, arr, answer);
		
		System.out.println(answer);
		
		sc.close();
	}
}
