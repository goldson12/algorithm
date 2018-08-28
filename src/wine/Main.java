package wine;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2156

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		int[][] d = new int[10001][3];
		
		if(1<=n && n<=10000) {
			
			for(int i=1; i<=n; i++) {
				int x = sc.nextInt();
				if(x>=0 && x<=1000) list.add(x);
			}
			
			for(int i=1; i<=n; i++) {
				d[i][0] = Math.max(Math.max(d[i-1][0], d[i-1][1]), d[i-1][2]);
				d[i][1] = d[i-1][0] + list.get(i);
				d[i][2] = d[i-1][1] + list.get(i);
			}

			/*for(int x=0; x<d.length; x++) {
				for(int y=0; y<d[x].length;y++) {
					System.out.print(d[x][y]+" ");
				}
				System.out.println();
			}*/
			
			System.out.println(Math.max(Math.max(d[n][0], d[n][1]), d[n][2]));
			
		}
		
	}

}
