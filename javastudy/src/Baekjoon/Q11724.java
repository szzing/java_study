package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11724 {
	static ArrayList<Integer>[] A;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<N+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			A[s].add(e);
			A[e].add(s);
		}
		
		int count = 0;
		for(int i = 1; i<N+1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		
		System.out.println(count);
		sc.close();
	}
	
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i : A[v]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}

}
