package Dynamicprog;


import java.util.*;
public class AllDir
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        sc.nextLine();
        int[][] pro = {{1,2,3},{6,5,4},{7,8,9}};
        int[][] sol = new int[n][m];
       
      
        sol[0][0] = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(sol[i][j]==0)
                {
                    sol[i][j]=1;
                }
                if(i+1<n)
                {
                    if(pro[i+1][j]-pro[i][j]==1)
                    {
                        sol[i+1][j]=sol[i][j]+1;
                    }
                }
                if(j+1<m)
                {
                    if(pro[i][j+1]-pro[i][j]==1)
                    {
                        sol[i][j+1]= sol[i][j]+1;
                    }
                }
                if(i-1>=0)
                {
                    if(pro[i-1][j]-pro[i][j]==1)
                    {
                        sol[i-1][j]=sol[i][j]+1;
                    }
                }
                if(j-1>=0)
                {
                    if(pro[i][j-1]-pro[i][j]==1)
                    {
                        sol[i][j-1]= sol[i][j]+1;
                    }
                }
                
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(sol[i][j]>max)
                {
                    max = sol[i][j];
                }
            }
        }
        System.out.println(max);
        
    }
}