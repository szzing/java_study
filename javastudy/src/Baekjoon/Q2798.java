package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int s = 0;
		int result = 0;
		int sum = 0;
		int temp = m;

		while (s < n - 1) {
			for (int i = s + 1; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					sum = arr[s] + arr[i] + arr[j];

					if (sum > m) {
						continue;
					}

					if (temp > m-sum) {
						temp = m-sum;
						result = sum;
					}
				}
			}

			s++;
		}

		System.out.println(result);

	}

}
