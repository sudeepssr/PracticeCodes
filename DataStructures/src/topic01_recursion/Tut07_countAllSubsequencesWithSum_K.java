package topic01_recursion;



import java.util.Scanner;

public class Tut07_countAllSubsequencesWithSum_K {
	
	public static int countSubsequences(int i, int n, int sum, int add, int[] arr) {
		
		if(i>= n) {
			
				// if condition satisfies
				if(add== sum) {
					return 1;
				}
				//if condition does not satisfy
				else {
					return 0;
				}
		}
		
		
		add+= arr[i];
		int left= countSubsequences(i+1, n, sum, add, arr);
		
		
		add-= arr[i];
		int right= countSubsequences(i+1, n, sum, add, arr);
		
		return left+ right;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int sum= sc.nextInt();
		int[] arr= new int[n];
		
		for(int i= 0; i< n; i++) {
			arr[i]= sc.nextInt();
		}
		
		
		System.out.println( countSubsequences(0, n, sum, 0, arr) );
		
		sc.close();
	}
}
