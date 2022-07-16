package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2470 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int s = 0;
		int e = n-1;
		int max = 2000000000;
		int[] result = new int[2];
		
		while(s<e) {
			int sum = arr[s] + arr[e];
			
			if(Math.abs(sum) < max) {
				result[0] = arr[s];
				result[1] = arr[e];
				max = Math.abs(sum);
			}
			
			if(sum>0) {
				e--;
			} else {
				s++;
			}
		}
		
		System.out.println(result[0] + " " + result[1]);
		
		
	}
}
