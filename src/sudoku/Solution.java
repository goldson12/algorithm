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
			
			for(int i=0; i<9; i++) {	// �� �ֱ�
				for(int j=0; j<9; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i = 0; i < 9; i++) {	// ������ �˻�
				list  = new ArrayList<>();
				for (int c = 1; c < 10; c++) {
					list.add(c); // ����Ʈ �ʱ�ȭ
				}
				for(int j = 0; j < 9; j++) {
					list.remove((Integer)arr[i][j]); // �ִ� ��� �ϳ��� �����
				}
				if(list.size() != 0) {
					flag = false;
				}
			}
			
			for(int i = 0; i < 9; i++) {	// ������ �˻�
				list  = new ArrayList<>();
				for (int c = 1; c < 10; c++) {
					list.add(c); // ����Ʈ �ʱ�ȭ
				}
				for(int j = 0; j < 9; j++) {
					list.remove((Integer)arr[j][i]); // �ִ� ��� �ϳ��� �����
				}
				if(list.size() != 0) {
					flag = false;
				}
			}
			
			for (int z = 0; z < 3; z++) { // 3x3 �� �˻�
				for (int x = 0; x < 9; x = x + 3) {
					list = new ArrayList<>();
					for (int c = 1; c < 10; c++) {
						list.add(c); // ����Ʈ �ʱ�ȭ
					}
					for (int i = x; i < x + 3; i++) {
						for (int j = y; j < y + 3; j++) {
							list.remove((Integer) arr[i][j]); // �ִ� ��� �ϳ��� �����
						}
					}
					if (list.size() != 0) {
						flag = false;
					}
					//System.out.println("���Ⱑ �ѽ���Ŭ ��. flag�� " + flag);
				}
				//System.out.println("�����: " + flag);
				if (y == 6) y = 0;
				else y = y + 3;
			}
			
			if(!flag) System.out.println("#" + (10-t) + " 0");
			else System.out.println("#" + (10-t) + " 1");
			
		}
		
		sc.close();
	}

}
