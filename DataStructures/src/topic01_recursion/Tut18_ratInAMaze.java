package topic01_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Tut18_ratInAMaze {
	
	public static void solve(int i, int j, int m[][], int n, ArrayList < String > ans, String move, 
			int vis[][], int di[], int dj[]) {
		
		if (i == n - 1 && j == n - 1) {
		   ans.add(move);
		   return;
		}
		String dir = "DLRU";
		for (int ind = 0; ind < 4; ind++) {
		   int nexti = i + di[ind];
		   int nextj = j + dj[ind];
		   if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n &&
				vis[nexti][nextj] == 0 && m[nexti][nextj] == 1) {

		        vis[i][j] = 1;
		        solve(nexti, nextj, m, n, ans, move + dir.charAt(ind), vis, di, dj);
		        vis[i][j] = 0;

		      }
		  }
		
	}
	
	public static ArrayList < String > findPath(int[][] m, int n) {
	    
		int vis[][] = new int[n][n];
	    
	    for (int i = 0; i < n; i++) {
	      for (int j = 0; j < n; j++) {
	        vis[i][j] = 0;
	      }
	    }
	    
	    int di[] = {+1,0,0,-1};
	    
	    int dj[] = {0,-1,1,0};
	    
	    ArrayList < String > ans = new ArrayList <> ();
	    
	    if (m[0][0] == 1) 
	    	solve(0, 0, m, n, ans, "", vis, di, dj);
	    
	    return ans;
	  }
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] m= new int[n][n];
		for(int i= 0; i< n; i++) {
			for(int j= 0; j< n; j++) {
				m[i][j]= sc.nextInt();
			}
		}
		
		
		ArrayList < String > res = findPath(m, n);
	    
		if (res.size() > 0) {
	      System.out.println(res);
	    } 
		
	    else {
	      System.out.println(-1);
	    }
	    
	    sc.close();
		
	}
}
