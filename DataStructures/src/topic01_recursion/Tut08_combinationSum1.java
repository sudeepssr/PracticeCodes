package topic01_recursion;

import java.util.ArrayList;

import java.util.Scanner;

public class Tut08_combinationSum1 {
	
	public static void combinationSum(int i, int n, int target, int[] arr,
			ArrayList<Integer> list, ArrayList< ArrayList<Integer> > answer) {
		
		if(i == n) {
			if(target== 0) {
				answer.add(new ArrayList<>(list) );
			}
			
			return;
			
		}
		
		if(arr[i]<= target) {
			list.add(arr[i]);
			combinationSum(i, n, target-arr[i], arr, list, answer);
			list.remove(list.size()-1);
		}
		
		combinationSum(i+1, n, target,arr, list, answer);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int target= sc.nextInt();
		
		int[] arr= new int[n];
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		ArrayList<Integer> list= new ArrayList<>();
		
		ArrayList< ArrayList<Integer> > answer= new ArrayList<>();
		
		combinationSum(0, n, target, arr, list, answer);
		
		System.out.println(answer);
		sc.close();
	}
}
