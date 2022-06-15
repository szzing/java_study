package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(A);

		for (int data : A) {
			bw.write(data + "\n");
		}

		bw.flush();
		bw.close();
	}
	
	private static void mergeSort(int[] A) {
		int[] tmp = new int[A.length];
		mergeSort(A, tmp, 0, A.length-1);
	}

	private static void mergeSort(int[] A, int[] tmp, int S, int E) {
		if (S < E) {
			int M = S + (E-S) / 2;
			mergeSort(A, tmp, S, M);
			mergeSort(A, tmp, M + 1, E);
			merge(A, tmp, S, M, E);
		}
	}

	private static void merge(int[] A, int[] tmp, int S, int M, int E) {
		for (int i = S; i <= E; i++) {
			tmp[i] = A[i];
		}

		int part1 = S;
		int part2 = M + 1;
		int index = S;

		while (part1 <= M && part2 <= E) {
			if (tmp[part1] <= tmp[part2]) {
				A[index] = tmp[part1];
				part1++;
				
			} else {
				A[index] = tmp[part2];
				part2++;
				
			}
			
			index++;
			
		}
		
		for (int i = 0; i <= M - part1; i++) {
			A[index + i] = tmp[part1 + i];
		}

	}

}
