package Baekjoon;

import java.util.Scanner;

public class Q1550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();

		String[] arr = sb.toString().split("");
		
		long result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			result += check(arr[i]) * Math.pow(16, i);
		}
		
		System.out.println(result);
		sc.close();
	}
	
	private static int check(String s) {
		switch(s) {
		case "A":
			return 10;
		case "B":
			return 11;
		case "C":
			return 12;
		case "D":
			return 13;
		case "E":
			return 14;
		case "F":
			return 15;
		default:
			return Integer.parseInt(s);
		}
	}

}
