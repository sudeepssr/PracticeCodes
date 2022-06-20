package topic01_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tut19_Kth_permutationSequence {
	
	public static String kthPermutation(int n, int k, String str) {
		
		int fact= 1;
		
		List<Integer> list= new ArrayList<>();
		
		for(int i= 1; i< n; i++) {
			fact= fact* i;
			list.add(i);
		}
		
		list.add(n);
		k= k-1;
		
		while(true) {
			
			str= str+ list.get(k/fact);
			list.remove(k/fact);
			
			if(list.size()== 0) {
				break;
			}
			
			k= k % fact;
			
			fact= fact/ list.size();
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int k= sc.nextInt();
		
		String str= "";
		
		System.out.println( kthPermutation(n, k, str) );
		sc.close();
	}
}
