package topic01_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Tut06_PrintAllSubsequences {
	
	public static void subsequences(int i, int n, int[] arr, ArrayList<Integer> list) {
		
		if(i >= n) {
			if(list.size()> 0) {
				System.out.println(list);
			}
			else if(list.size()== 0) {
				System.out.println("{}");
			}
			
			System.out.println();
			return;
		}
		
		//suppose this is when we decide to select this element
		list.add(arr[i]);
		subsequences(i+1, n, arr, list);
		
		//now when we do not chose this particular element
		list.remove(list.size()-1);
		subsequences(i+1, n, arr, list);
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		ArrayList<Integer> list= new ArrayList<>();
		subsequences(0, n, arr, list);
		
		sc.close();
	}
}
