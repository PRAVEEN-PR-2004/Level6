package Dynamicprog;

import java.util.Scanner;

public class Knapasack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(", ");
        
        int[] value = new int[s.length + 1]; 
        for (int i = 0; i < s.length; i++) {
            value[i + 1] = Integer.parseInt(s[i].trim()); 
        }
        
        int[] len = new int[s.length + 1]; 
        for (int i = 0; i < s.length; i++) {
            len[i + 1] = i + 1; 
        }
        
        int n = s.length; // Number of items
        int W = n; // Maximum weight capacity is same as number of items
        int[][] arr = new int[n + 1][W + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (len[i] <= j) {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - len[i]] + value[i]);
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        
        System.out.print(arr[n][W]);
        
        sc.close(); 
    }

}
