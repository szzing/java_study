package Baekjoon;

import java.util.Scanner;

public class Q2231 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		sc.close();
		
	}

}
