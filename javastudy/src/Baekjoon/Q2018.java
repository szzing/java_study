package Baekjoon;

import java.util.Scanner;

public class Q2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int cnt = 1;
		int s = 1;
		int e = 1;
		int sum = 1;
		
		while(e != num) {
			if(sum == num) {
				cnt++;
				e++;
				sum += e;
			} else if(sum > num) {
				sum -= s;
				s++;
			} else if(sum < num) {
				e++;
				sum += e;
			}
		}
		
		System.out.println(cnt);
	}

}
