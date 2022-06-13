package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] result = new int[N];
		
		String[] temp = br.readLine().split(" ");
		
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(temp[i]);
		}

		stack.push(0);
		
		for (int i = 1; i < N; i++) {
			while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
				result[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		
		while (!stack.empty()) {
			result[stack.pop()] = -1;
		}

		for (int r : result) {
			bw.write(r + " ");
		}

		bw.flush();
	}

}
