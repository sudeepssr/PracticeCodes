package topic01_recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tut17_palindromePartitioning {
	
	public static void partition( int i, String str, List<String> list, List< List<String> > ans) {
		
		if(i== str.length() ) {
			ans.add(new ArrayList<>(list) );
			return ;
		}
		
		for(int j= i; j< str.length(); j++) {
			
			if( isPalindrome(str, i, j) == true ) {
				list.add( str.substring(i, j+1) );
				
				partition(j+1, str, list, ans);
				
				list.remove(list.size()-1 ); // to remove the last element for backtracking
			}
		}
	}
	
	public static boolean isPalindrome(String str, int begin, int end) {
		
		while(begin<= end) {
			
			if(str.charAt(begin)!= str.charAt(end) ) {
				return false;
			}
			begin++;
			end--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		List<String > list= new ArrayList<>();
		List< List< String> > ans= new ArrayList<>();
		
		partition(0, str, list, ans);
		
		System.out.println(ans);
		
		
		
		sc.close();
	}
}



