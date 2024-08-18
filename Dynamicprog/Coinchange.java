package Dynamicprog;

import java.util.Scanner;

public class Coinchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins = {1,2,3};
        int total = 5;
        int[] values = new int[coins.length+1];
        values[0] = 0;
        for(int i=1;i<values.length;i++)
        {
            values[i] = coins[i-1];
        }
        int[][] arr = new int[coins.length+1][total+1];
        for(int i=0;i<values.length;i++)
        {
            for(int j=0;j<total+1;j++)
            {
                if(j==0)
                {
                    arr[i][j]=1;
                }
                else if(i==0 && j!=0)
                {
                    arr[i][j] = 0;
                }
                else if(values[i]>j)
                {
                    arr[i][j]= arr[i-1][j];
                }
                else
                {
                    arr[i][j]=arr[i-1][j] +arr[i][j-values[i]];   
                }
                
            }
        }
        for(int i=0;i<values.length;i++)
        {
            for(int j=0;j<total+1;j++)
            {
                System.out.print(arr[i][j]+" ");
                
            }System.out.println();
        }
        

    }
}
