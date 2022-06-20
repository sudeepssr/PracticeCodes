package topic01_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tut11_subsetSum2 {
	
//	public static void subsetSum_BruteForce(int i, int n, int[] arr, List<Integer> list, Set< List<Integer> > subsetList ) {
//		
//		if(i== n) {
//			subsetList.add(new ArrayList<Integer>(list) );
//			return;
//		}
//		
//		//when we pick this element
//		list.add(arr[i]);
//		subsetSum_BruteForce(i+1, n, arr, list, subsetList);
//		list.remove(list.size()-1);
//		
//		//when we do not pick this element
//		subsetSum_BruteForce(i+1, n, arr, list, subsetList);
//		
//		
//	}
	
	public static void subsetSum(int i, int n, int[] arr, List<Integer> list, List< List<Integer> > subsetList) {

		subsetList.add(new ArrayList<Integer>(list) );
		
		
		for(int j= i; j< n; j++) {
			if(j!= i && arr[j]== arr[j-1] ) {
				continue;
			}
			list.add(arr[j] );
			subsetSum(j+1, n, arr, list, subsetList);
			list.remove(list.size()-1 );
			
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
		
//		Set< List<Integer> > subsetList= new HashSet<>();
//		subsetSum_BruteForce(0, n, arr, list, subsetList);
//		System.out.println(subsetList);
		
		List< List<Integer> > subsetList= new ArrayList<>();
		subsetSum(0, n, arr, list, subsetList);
		System.out.println(subsetList);
		sc.close();
	}
}
