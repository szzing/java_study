package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2752 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
		for (int i = 0; i < 3; i++) {
			myQueue.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(myQueue.poll()+" "+myQueue.poll()+" "+myQueue.poll());
		
	}

}
