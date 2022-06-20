package topic01_recursion;

import java.util.Scanner;

public class Tut01_print {

	public static void fun(int count, int n) {
		if (count == n) {
			return;
		}

		System.out.println(count);
		count++;
		fun(count, n);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		fun(count, n);
		sc.close();
	}
}
