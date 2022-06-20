package topic01_recursion;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Tut12_printAllPermutations {
	
	public static void printPermutations(int n, int[] arr, List<Integer> list, List< List<Integer> > answer, boolean[] freq) {
		
		if(list.size()== n) { 
			answer.add(new ArrayList<>(list) );
			return;
		}
		
		for(int j= 0; j< n; j++) {
			if(freq[j]== false) {
				freq[j]= true;
				list.add(arr[j] );
				printPermutations(n, arr, list, answer, freq);
				list.remove(list.size()-1 );
				freq[j]= false;
			}
			
		}
		
	}
	 
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		List<Integer> list= new ArrayList<>();
		List< List<Integer> > answer= new ArrayList<>();
		
		boolean[] freq= new boolean[n];
		
		printPermutations(n, arr, list, answer, freq);
		System.out.println(answer);
		
		sc.close();
		
	}
}
