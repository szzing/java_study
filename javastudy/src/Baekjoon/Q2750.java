package Baekjoon;

import java.util.Scanner;

public class Q2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		int temp = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}

		for (int a : A) {
			System.out.println(a);
		}
	}

}
