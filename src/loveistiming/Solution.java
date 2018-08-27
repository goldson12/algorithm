package loveistiming;
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWLv6mx6htoDFAVV

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a = 11*24*60 + 11*60 + 11;
		
		if(t <= 10) {
			
			for(int i=1; i<=t; i++) {
				int d = sc.nextInt();
				int h = sc.nextInt();
				int m = sc.nextInt();
				
				if(11<=d && d<=14 && 0<=h && h<=23 && 0<=m && m<=59) {
					
					int b = d*24*60 + h*60 + m;
					int result = 0;
					
					if(a > b) result = -1;
					else if(a == b) result = 0;
					else result = b-a;
					
					System.out.println("#"+i+" "+result);
				}
				
			}
			
		}
		
	}

}
