package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
//			String str = String.valueOf(Math.round(Math.pow(a, b))); 정수범위 초과함
			
			int num = 1;
			for(int j = 0; j < b; j++) {
				num = (num*a) % 10;
			}
			
			if(num==0) {
				sb.append("10\n");
			} else {
				sb.append(num+"\n");
			}
		}

		System.out.println(sb);
	}

}
