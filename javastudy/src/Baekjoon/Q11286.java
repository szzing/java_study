package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q11286 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			if (Math.abs(o1) == Math.abs(o2)) {
				return o1 - o2;
			} else {
				return Math.abs(o1) - Math.abs(o2);
			}
		});

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			
			if (x == 0) {
				if(pq.size()==0) {
					sb.append("0\n");
				} else {
					sb.append(pq.poll()+"\n");
				}
			} else {
				pq.add(x);
			}
		}
		System.out.println(sb);
		sc.close();
	}

}
