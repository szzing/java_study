package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12891 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());

		String[] dna = new String[S];
		dna = br.readLine().split("");

		int[] minStr = new int[4];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < minStr.length; i++) {
			minStr[i] = Integer.parseInt(st.nextToken());
		}

		int start = 0;
		int end = P - 1;
		int[] now = new int[4];

		for (int i = start; i <= end; i++) {
			now[checkIndex(dna[i])]++;
		}

		int result = 0;

		while (end < dna.length) {
			int check = 0;
			for (int i = 0; i < 4; i++) {
				if (now[i] < minStr[i]) {
					continue;
				} else {
					check++;
				}
			}

			if (check == 4) {
				result++;
			}

			now[checkIndex(dna[start])]--;
			start++;
			
			if(end+1 < dna.length) {
				end++;
				now[checkIndex(dna[end])]++;
			} else {
				break;
			}

		}
		
		System.out.println(result);

	}
	
	private static int checkIndex(String str) {
		int idx = 0;
		
		switch (str) {
		case "A":
			idx = 0;
			break;
		case "C":
			idx = 1;
			break;
		case "G":
			idx = 2;
			break;
		case "T":
			idx = 3;
			break;
		};
		
		return idx;
	}

}
