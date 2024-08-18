package Dynamicprog;

import java.util.Scanner;

public class AntMaze4dir {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] pro = new int[n][m];
        int[][] sol = new int[n][m];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++)
            {
                pro[i][j] = sc.nextInt();
            }
        }
        sol[0][0]=1;
      
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(sol[i][j]==0)
                {
                    sol[i][j] = 1;
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
                    sol[i][j+1]=sol[i][j]+1;
                }
                }
                
            }
        }
       
       
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(i-1>=0)
                {
                    
                if(pro[i-1][j]-pro[i][j]==1)
                {
                    sol[i-1][j] = sol[i][j]+1;
                }
                }
                if(j-1>=0)
                {
                    
                if(pro[i][j-1]-pro[i][j]==1)
                {
                    sol[i][j-1] = sol[i][j]+1;
                }
                }
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(sol[i][j]==0)
                {
                    sol[i][j] = 1;
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
                    sol[i][j+1]=sol[i][j]+1;
                }
                }
                
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(sol[i][j]==0)
                {
                    sol[i][j] = 1;
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
                    sol[i][j+1]=sol[i][j]+1;
                }
                }
                
            }
        }
        int max=0;
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

        sc.close();
    }
}
