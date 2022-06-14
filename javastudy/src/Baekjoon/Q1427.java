package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		int[] nums = new int[str.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			int min = 1000000000;
			int minIdx = 0;
			for(int j = i; j<nums.length; j++) {
				if(nums[j]<min) {
					min = nums[j];
					minIdx = j;
				}
			}
			swap(nums, i, minIdx);
		}

		for (int i=nums.length-1; i>=0; i--) {
			System.out.print(nums[i]);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
