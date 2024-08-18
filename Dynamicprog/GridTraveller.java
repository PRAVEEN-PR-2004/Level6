package Dynamicprog;

import java.util.Scanner;

public class GridTraveller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] arr = new int[n+1][m+1];
        arr[1][1]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                 if(j+1 <=m)
                 {
                    arr[i][j+1] += arr[i][j];
                 }
                 if(i+1 <=n)
                 {
                    arr[i+1][j] += arr[i][j];
                 }
            }
        }
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.print(arr[row][col]);

        sc.close();
    }
    
}
