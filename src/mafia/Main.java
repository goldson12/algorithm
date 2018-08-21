package mafia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {			// not completed yet!!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		if(2 < t && t < 500000) {
			
			int[] al = new int[t+1];
			int[] al2 = new int[t+1];
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i=1; i<=t; i++) {
				al[i] = sc.nextInt();
			}
			
			for (int i : al) {
				al2[i] += 1;
			}
			
			for (int i=1; i<al2.length; i++) {
				if(al2[i] >= 2) {
					for(int j=1; j<al.length; j++) {
						if(al[j] == i) list.add(j);
					}
				}
			}
			
			for(int i=1; i< al2.length; i++) {
				if(al2[i] >= 2 && list.contains(i)) {
					list.remove((Object) i);
				}
			}
			
			if(list.size() == 0) System.out.println(1);
			else System.out.println(list.size());
			
		}
		
	}

}
