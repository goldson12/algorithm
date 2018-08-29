package fiboDP;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			
			int x = sc.nextInt();
			int [][] arr = new int[2][x+1];
			
			for(int j=0; j<=x; j++) {
				if(j == 0) {
					arr[0][0] = 1;
					arr[1][0] = 0;
				}
				else if(j == 1) {
					arr[0][1] = 0;
					arr[1][1] = 1;
				}
				else {
					arr[0][j] = arr[0][j-2] + arr[0][j-1];
					arr[1][j] = arr[1][j-2] + arr[1][j-1];
				}
			}
			
			System.out.println(arr[0][x] + " " + arr[1][x]);
			
		}
		
	}
	
}
