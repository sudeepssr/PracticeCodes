package topic01_recursion;

import java.util.Scanner;

public class Tut15_sudokoSolver {
	
	public static boolean solve(char[][] board) {
		
		for(int i= 0; i< 9; i++) {
			for(int j= 0; j< 9; j++) {
				if(board[i][j]== '-') {
					for(char c= '1'; c<= '9'; c++) {
						if(isValid(board, i, j, c) ) {
							
							board[i][j]= c;
							
							if(solve(board)== true) {
								return true;
							}
							else {
								board[i][j]= '-';
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValid(char[][] board, int row, int col, char c) {
		
		for(int i= 0; i< 0; i++) {
			if(board[i][col]== c)
				return false;
		
			if(board[row][i]== c)
				return false;
			
			if(board[3*(row/3) + (i/3) ][ 3*(col/3) + (i%3) ] == c)
				return false;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		char[][] board= new char[9][9];
		
		for(int i= 0; i< 9; i++) {
			for(int j= 0; j< 9; j++) {
				board[i][j]= sc.next().charAt(0);
			}
		}
		
		solve(board);
		
		for(int i= 0; i< 9; i++) {
			for(int j= 0; j< 9; j++) {
				System.out.println(board[i][j]+" ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
	
}
