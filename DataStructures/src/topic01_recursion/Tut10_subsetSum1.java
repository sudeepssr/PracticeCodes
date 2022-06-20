package topic01_recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tut10_subsetSum1 {
	
	public static void subsetSum(int i, int n, int sum, int[] arr, List<Integer> list) {
		
		if(i== n) {
			list.add(sum);
			return;
		}
		
		//When we pick this element
		
		subsetSum(i+1, n, sum+arr[i], arr, list);
		
		//when we do not pick this element
		subsetSum(i+1, n, sum, arr, list);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		List<Integer> list= new ArrayList<>();
		
		
		subsetSum(0, n, 0, arr, list);
		
		Collections.sort(list);
		System.out.println(list);
		sc.close();
		
	}
}
