package topic01_recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tut09_combinationSum2 {
	
//	public static void combinationSum_BruteForce(int i, int n, int target, int[] arr, List<Integer> list, Set< List<Integer> > answer) {
//		
//		if(i== n) {
//			if(target== 0) {
//				answer.add(new ArrayList<Integer>(list));
//			}
//			return;
//		}
//		
//		if(arr[i]<= target) {
//			list.add(arr[i]);
//			combinationSum_BruteForce(i+1, n, target-arr[i], arr, list, answer);
//			
//			list.remove(list.size()-1);
//		}
//		combinationSum_BruteForce(i+1, n, target, arr, list, answer);
//	}
	
	public static void combinationSum_Optimize(int i, int n, int target, int[] arr, List<Integer> list, List< List<Integer> > ans) {
		
		if(target== 0) {
			ans.add(new ArrayList<>(list) );
			return;
		}
		
		for(int j= i; j< n; j++) {
			
			if(j> i && arr[j]== arr[j-1] ) {
				continue;
			}
			
			if(arr[j]> target) {
				break;
			}
			
			list.add(arr[j] );
			combinationSum_Optimize(j+1, n, target-arr[j], arr, list, ans);
			list.remove(list.size()-1 );
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int target= sc.nextInt();
		
		int[] arr= new int[n];
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		List<Integer> list= new ArrayList<>();
		
		//Set< List<Integer> > answer= new HashSet<>();
		//combinationSum_BruteForce(0, n, target, arr, list, answer);
		//System.out.println(answer);
		
		Arrays.sort(arr);
		List< List<Integer> > ans= new ArrayList<>();
		combinationSum_Optimize(0, n, target, arr, list, ans);
		System.out.println(ans);
		
		sc.close();
		
	}
}
