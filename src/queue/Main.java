package queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		int start = 0, end = 0;
		
		if(1<=t && t<=10000) {
			
			int[] arr = new int[t];
			
			for(int i=0; i<t; i++) {
				String cmd = sc.nextLine();
				switch (cmd.substring(0, 2)) {
				case "pu":
					int x = Integer.parseInt(cmd.split(" ")[1]);
					arr[end++] = x;
					break;
				case "po":
					if(start == end) System.out.println("-1");
					else {
						System.out.println(arr[start]);
						arr[start++] = 0;
					}
					break;
				case "si":
					System.out.println(end - start);
					break;
				case "em":
					if(start == end) System.out.println("1");
					else System.out.println("0");
					break;
				case "fr":
					if(start == end) System.out.println("-1");
					else System.out.println(arr[start]);
					break;
				case "ba":
					if(start == end) System.out.println("-1");
					else System.out.println(arr[end-1]);
					break;
				}
				
			}
			
		}
		
	}

}
