package stack;
// https://www.acmicpc.net/problem/10828

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		int s = 0;
		
		if(1 <= t && t <= 10000) {
			int[] arr = new int[t];
			
			for(int i=0; i<t; i++) {
				String cmd = sc.nextLine();
				switch (cmd.substring(0, 2)) {
				case "pu":
					int x = Integer.parseInt(cmd.split(" ")[1]);
					arr[s++] = x;
					break;
				case "po":
					if (s == 0) System.out.println("-1");
					else System.out.println(arr[--s]);
					break;
				case "si":
					System.out.println(s);
					break;
				case "em":
					if(s == 0) System.out.println("1");
					else System.out.println("0");
					break;
				case "to":
					if(s ==0) System.out.println("-1");
					else System.out.println(arr[s-1]);
					break;
				}
				
			}
			
		}
		
	}

}
