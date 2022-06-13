package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuffer sb = new StringBuffer();

		int N = sc.nextInt();
		int num = 1;
		int p = 0;
		boolean chk = true;

		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();

			if (stack.size() != 0) {
				p = stack.peek();

				if (input > p) {
					if (num > input) {
						chk = false;
						break;

					} else if(num == input){
						stack.push(num++);
						sb.append("+\n");
						stack.pop();
						sb.append("-\n");
					} else {
						while (input > p) {
							stack.push(num++);
							sb.append("+\n");
							p = stack.peek();
						}
						if (p == input) {
							stack.pop();
							sb.append("-\n");
						}
					}

				} else if (input == p) {
					stack.pop();
					sb.append("-\n");
					
				} else {
					while (input < p) {
						p = stack.peek();
						stack.pop();
						sb.append("-\n");
					}
				}

			} else {
				if (num > input) {
					chk = false;
					break;

				} else {
					while (num <= input) {
						stack.push(num++);
						sb.append("+\n");
						p = stack.peek();
					}
					if (p == input) {
						stack.pop();
						sb.append("-\n");
					}
				}

			}

		}

		if (chk == true) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}

		sc.close();

	}

}
