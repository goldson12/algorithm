package mode;
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV13zo1KAAACFAYh

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map2;
		int max;
		
		for(int z=0; z<count; z++) {
			
			map2 = new HashMap<>();
			max = 0;
			
			int t = sc.nextInt();
			
			for(int i=0; i<1000; i++) {
				int x = sc.nextInt();
				
				if(map2.get(x) == null) {
					map2.put(x, 1);
				} else {
					map2.put(x, map2.get(x)+1);
				}
			}
			
			for(int i=0; i<100; i++) {
				if(map2.get(i) <= map2.get(i+1) && max <= map2.get(i+1)) {
					max = map2.get(i+1);
					map.put(t, i+1);
				}
			}
			
		}
		
		for(int i=1; i<=count; i++) {
			System.out.println("#"+i+" "+map.get(i));
		}
		
	}

}
