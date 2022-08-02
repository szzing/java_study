package Baekjoon;

import java.util.Scanner;

public class Q1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];

		for (int i = 0; i < 3; i++) {
			str[i] = check(sc.nextLine());
		}
		
		long result = Integer.parseInt(str[0].concat(str[1]));
		long temp = (long) Math.pow(10, Integer.parseInt(str[2]));
		
		System.out.println(result*temp);
		sc.close();

	}

	private static String check(String s) {
		switch (s) {
		case "black":
			return "0";
		case "brown":
			return "1";
		case "red":
			return "2";
		case "orange":
			return "3";
		case "yellow":
			return "4";
		case "green":
			return "5";
		case "blue":
			return "6";
		case "violet":
			return "7";
		case "grey":
			return "8";
		case "white":
			return "9";
		default:
			return null;
		}
	}
}
