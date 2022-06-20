package topic01_recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tut14_Nqueens {
	
	public static List< List<String> > solveNqueens(int n){
		
		char[][] board= new char[n][n];
		for(int i= 0; i< n; i++) {
			for(int j= 0; j< n; j++) {
				board[i][j]= '-';
			}
		}
		
		List< List< String > > res= new ArrayList< List<String> >();
		dfs(0, board, res);
		return res;
	}
	
	public static void dfs(int col, char[][] board, List< List<String> > res) {
		if(col== board.length) {
			res.add(construct(board) );
			return;
		}
		
		for(int row= 0; row< board.length; row++) {
			if(validate(board, row, col) ) {
				//if this is a valid position, then we will add queen here
				board[row][col]= 'Q';
				dfs(col+1, board, res);
				
				// for backtracking:-
				board[row][col]= '-';
				
			}
		}
		
	}
	
	public static List<String> construct(char[][] board) {
		List<String> res= new LinkedList<String> ();
		for(int i= 0; i< board.length; i++) {
			String s= new String(board[i] );
			res.add(s);
		}
		
		return res;
	}
	
	public static boolean validate(char[][] board, int row, int col) {
		
		int duprow= row;
		int dupcol= col;
		
		//checking for direction number 1 , ie, diagonally-upper- back direction
		while(row>= 0 && col>= 0 ) {
			if(board[row][col] == 'Q') {
				return false;
			}
			
			row--;
			col--;
		}
		
		row= duprow;
		col= dupcol;
		
		//checking for direction number 2 , ie, middle- back direction
		while(col>= 0 ) {
			if(board[row][col] == 'Q') {
				return false;
			}
					
			col--;
		}
		
		row= duprow;
		col= dupcol;
		
		//checking for direction number 3 , ie, diagonally-lower- back direction
		while(row< board.length && col>= 0 ) {
			if(board[row][col] == 'Q') {
				return false;
			}
					
			row++;
			col--;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		List< List<String> > queen = solveNqueens(n);
		
		int i= 1;
		
		for(List< String > it: queen) {
			
			System.out.println("case no: "+ i);
			for(String s: it) {
				System.out.println(s);
			}
			System.out.println();
			i++;
		}
		
		sc.close();
	}
}
