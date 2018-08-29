package wineDP;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2156

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		int[] dp = new int[n+1];
		
		if(1<=n && n<=10000) {
			
			for(int i=1; i<=n; i++) {
				int x = sc.nextInt();
				if(x>=0 && x<=1000) list.add(x);
			}
			
			for(int i=1; i<=n; i++) {
				if(i == 1)
					dp[i] = list.get(i);
				else if(i == 2)
					dp[i] = list.get(i-1) + list.get(i);
				else
					dp[i] = Math.max(dp[i-1], Math.max(dp[i-3] + list.get(i-1) + list.get(i), dp[i-2] + list.get(i)));
			}
			
			System.out.println(dp[n]);
			
		}
		
	}

}
