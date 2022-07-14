package Baekjoon;

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if (n == 0) {
			System.out.println(1);
		} else {
			int result = factorial(n);
			System.out.println(result);
		}
	}

	private static int factorial(int num) {
		if (num <= 1) {
			return num;
		}

		return num * factorial(num - 1);
	}

}
