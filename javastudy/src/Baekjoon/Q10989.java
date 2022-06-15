package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10989 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		Arrays.sort(A);
		
		for(int a:A) {
			bw.append(a+"\n");
		}
		
		bw.flush();
		bw.close();
	}

}
