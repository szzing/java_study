package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		
		int num = 1;
		for(int i=0; i<N; i++) {
			queue.add(num++);
		}
		
		while(queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());
		sc.close();
	}

}
