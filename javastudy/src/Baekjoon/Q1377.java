package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1377 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Comp[] A = new Comp[N];

		for (int i = 0; i < N; i++) {
			A[i] = new Comp(Integer.parseInt(br.readLine()), i);
		}

		Arrays.sort(A);
		int Max = 0;
		for (int i = 0; i < N; i++) {
			if (Max < A[i].index - i) {
				Max = A[i].index - i;
			}
		}
		System.out.println(Max + 1);
	}

}

class Comp implements Comparable<Comp> {
	int value;
	int index;

	public Comp(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}

	@Override
	public int compareTo(Comp o) {
		return this.value - o.value;
	}
}