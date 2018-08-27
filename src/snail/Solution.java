package snail;
// https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE

import java.util.ArrayList;
import java.util.Scanner;
 
public class Solution {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int count = sc.nextInt();
        int t = 1;
        ArrayList<Integer> list = new ArrayList<>();
         
        if(count < 1 || count > 10) return;
        else {
            for(int i = 0; i < count; i++) {
                list.add(sc.nextInt());
            }
        }
         
        for(int z = 0; z < count; z++) {
 
            int[][] arr = new int[list.get(z)][list.get(z)];
            int x = 1;
            int start = 0;
            int end = list.get(z);
             
            for(int i = 0; i < arr.length * 2; i++) {
                 
                if(i % 4 == 0) {    // À­ÁÙ
                    for(int j = start; j < end; j++) {
                        arr[start][j] = x++;
                    }
                    start++;
                }
                else if(i % 4 == 1) {   // ¿À¸¥ÂÊÁÙ
                    for(int j = start; j < end; j++) {
                        arr[j][end-1] = x++;
                    }
                    end--;
                }
                else if(i % 4 == 2) {   // ¾Æ·§ÁÙ
                    for(int j = end; j > start-1; j--) {
                        arr[end][j-1] = x++;
                    }
                }
                else if(i % 4 == 3) {   // ¿ÞÂÊÁÙ
                    for(int j = end-1; j > start-1; j--) {
                        arr[j][start-1] = x++;
                    }
                }
                 
            }
             
            System.out.println("#" + t++);
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr.length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
             
        }
 
    }
 
}