package Dynamicprog;

import java.util.Scanner;

public class GridTravellereasy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[][] arr = new long[n+1][m+1];
        arr[1][1] = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 && j==1) continue;
                long above = 0;
                long left = 0;
                if(i>1)
                {
                    
                    above = arr[i-1][j];
                }
                if(j>1)
                {
                    
                   left = arr[i][j-1];
                }
                
                arr[i][j] = above+left;
            }
        }
        System.out.print(arr[n][m]);
    }
}
