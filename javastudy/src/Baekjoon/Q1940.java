package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1940 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		long[] A = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int s = 0;
		int e = N-1;
		int answer = 0;
		
		while(s<e) {
			long sum = A[s]+A[e];
			if(sum == M) {
				answer++;
				s++;
			} else if(sum > M) {
				e--;
			} else {
				s++;
			}
		}

		System.out.println(answer);
	}
}
