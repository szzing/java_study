package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q18258 {

	static int[] arr = {};
	static int f;
	static int b;
	static int size;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		f = 0;
		b = 0;
		arr = new int[n];

		String str = "";
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			orderSwitch(str);
		}

		bw.flush();
	}

	private static void orderSwitch(String str) throws IOException{
		String order = str.split(" ")[0];
		switch(order) {
		case "push":
			arr[b] = Integer.parseInt(str.split(" ")[1]);
			b++;
			break;
			
		case "pop":
			if(b==f) {
				bw.append("-1\n");
			} else {
				bw.append(arr[f]+"\n");
				f++;
			}
			break;
			
		case "size":
			bw.append(b-f+"\n");
			break;
			
		case "empty":
			if(b==f) {
				bw.append("1\n");
			} else {
				bw.append("0\n");
			}
			break;
			
		case "front":
			if(b==f) {
				bw.append("-1\n");
			} else {
				bw.append(arr[f]+"\n");
			}
			break;
			
		case "back":
			if(b==f) {
				bw.append("-1\n");
			} else {
				bw.append(arr[b-1]+"\n");
			}
			break;
		}
		
	}

}
