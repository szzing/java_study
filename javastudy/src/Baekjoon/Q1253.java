package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1253 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long[] A = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}

		Arrays.sort(A);

		int answer = 0;

		for (int i = 0; i < N; i++) {
			long find = A[i];

			int s = 0;
			int e = N - 1;

			while (s < e) {
				long temp = A[s] + A[e];
				
				if (temp == find) {
					if (s != i && e != i) {
						answer++;
						break;
						
					} else if (s == i) {
						s++;
						
					} else if (e == i) {
						e--;
						
					}
					
				} else if (temp < find) {
					s++;
					
				} else {
					e--;
				}
				
			}

		}
		
		System.out.println(answer);
	}
	
}
