package sudoku;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		ArrayList<Integer> list = null;
		boolean flag = true;
		int y = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		
		while(t-- != 0) {
			flag = true;
			
			for(int i=0; i<9; i++) {	// 값 넣기
				for(int j=0; j<9; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i = 0; i < 9; i++) {	// 가로줄 검사
				list  = new ArrayList<>();
				for (int c = 1; c < 10; c++) {
					list.add(c); // 리스트 초기화
				}
				for(int j = 0; j < 9; j++) {
					list.remove((Integer)arr[i][j]); // 있는 요소 하나씩 지우기
				}
				if(list.size() != 0) {
					flag = false;
				}
			}
			
			for(int i = 0; i < 9; i++) {	// 세로줄 검사
				list  = new ArrayList<>();
				for (int c = 1; c < 10; c++) {
					list.add(c); // 리스트 초기화
				}
				for(int j = 0; j < 9; j++) {
					list.remove((Integer)arr[j][i]); // 있는 요소 하나씩 지우기
				}
				if(list.size() != 0) {
					flag = false;
				}
			}
			
			for (int z = 0; z < 3; z++) { // 3x3 줄 검사
				for (int x = 0; x < 9; x = x + 3) {
					list = new ArrayList<>();
					for (int c = 1; c < 10; c++) {
						list.add(c); // 리스트 초기화
					}
					for (int i = x; i < x + 3; i++) {
						for (int j = y; j < y + 3; j++) {
							list.remove((Integer) arr[i][j]); // 있는 요소 하나씩 지우기
						}
					}
					if (list.size() != 0) {
						flag = false;
					}
					//System.out.println("여기가 한싸이클 끝. flag는 " + flag);
				}
				//System.out.println("결과는: " + flag);
				if (y == 6) y = 0;
				else y = y + 3;
			}
			
			if(!flag) System.out.println("#" + (10-t) + " 0");
			else System.out.println("#" + (10-t) + " 1");
			
		}
		
		sc.close();
	}

}
