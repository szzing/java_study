package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();
		
		int num = 1;
		for(int i=0; i<n; i++) {
			queue.add(num++);
		}
		
		while(queue.size()>0) {
			for(int i = 0; i < k-1; i++) {
				queue.add(queue.poll());
			}
			result.add(queue.poll());
		}
		
		String str = result.toString();
		str = str.replaceAll("\\[", "<");
		str = str.replaceAll("\\]", ">");
		System.out.println(str);
		
	}

}
