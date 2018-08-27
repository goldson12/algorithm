package wine;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2156

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int max = 0;
		
		if(1<=n && n<=10000) {
			
			for(int i=0; i<n; i++) {
				int x = sc.nextInt();
				if(x>=0 && x<=1000) list.add(x);
			}
			
			
			
		}
		
	}

}
