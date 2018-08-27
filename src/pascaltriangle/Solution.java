package pascaltriangle;
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5P0-h6Ak4DFAUq

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<t; i++) {
			list.add(sc.nextInt());
		}
		
		for(int x=1; x<=t; x++) {
			int n = list.get(x-1);
			
			if(1 <= n && n <= 10) {
				int[][] arr = new int[n][n];
				
				arr[0][0] = 1;
				
				for(int i=1; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(j-1 == -1 || arr[i-1][j-1] == 0) {
							arr[i][j] = arr[i-1][j];
						} else if(j == i || arr[i-1][j] == 0) {
							arr[i][j] = arr[i-1][j-1];
						} else {
							arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
						}
					}
				}
				
				System.out.println("#"+x);
				for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr[i].length; j++) {
						if(arr[i][j] != 0) {
							System.out.print(arr[i][j]+" ");
						}
					}
					System.out.println();
				}
				
			} else {
				System.exit(0);
			}
			
		}
		
	}
}
