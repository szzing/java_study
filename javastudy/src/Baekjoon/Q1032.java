package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] str = new String[n];

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}

		String[] temp = str[0].split("");

		for (int i = 1; i < n; i++) {
			for(int j=0; j< temp.length; j++) {
				if(str[i].split("")[j].equals(str[i-1].split("")[j])) {
					continue;
				} else {
					temp[j] = "?";
				}
			}
		}
		
		for(String t:temp) {
			System.out.print(t);
		}

	}

}
