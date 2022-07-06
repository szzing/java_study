package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q1927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		int N = sc.nextInt();

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();

			if (num == 0) {
				if (pq.size() == 0) {
					sb.append(0 + "\n");
				} else {
					sb.append(pq.poll() + "\n");
				}
			} else {
				pq.add(num);
			}
		}

		System.out.println(sb);
		sc.close();
	}

}
