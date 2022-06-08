package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double[] scores = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double M = 0;
		for(int i=0; i<N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if(scores[i] > M) {
				M = scores[i];
			}
		}
		
		double newSum = 0;
		for(int i = 0; i < N; i++) {
			newSum += scores[i] / M * 100;
		}
		
		System.out.println(newSum/N);
	}

}
