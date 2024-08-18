package BackTracking;

import java.util.Scanner;

public class Optimizepath {
    static int flag = 0;
    static int mincount = 1000;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pro = new int[n][n];
        int[][] sol = new int[n][n];
        int[][] minpath = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {

                pro[i][j]=sc.nextInt();
            }
        }
        path(0,0,n,pro,sol,1,minpath);
        if(flag == 0)
        {
            System.out.print("No ");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(minpath[i][j]+" ");
                }System.out.println();
            }
        }
        sc.close();
        

    }
    public static boolean path(int x,int y,int n,int[][] pro,int[][] sol,int count,int[][] minpath)
    {
        
        if(x==n-1 && y==n-1 && pro[x][y] == 0 )
        { 
            sol[x][y] =1;
            flag = 1;
            if(count<mincount)
            {
                mincount = count;
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                       minpath[i][j] = sol[i][j];
                    }
                }

            }
            return false;
        }
        if(x>=0 && y>=0 && x<n && y<n && pro[x][y]==0 && sol[x][y] == 0)
        {
            sol[x][y]=1;
            if(path(x+1,y,n,pro,sol,count+1,minpath)==true)
            {
                return true;
            }
            if(path(x,y+1,n,pro,sol,count+1,minpath)==true)
            {
                return true;
            }
            if(path(x-1,y,n,pro,sol,count+1,minpath)==true)
            {
                return true;
            }
            if(path(x,y-1,n,pro,sol,count+1,minpath)==true)
            {
                return true;
            }
            sol[x][y]=0;
            return false;
            
        }
        return false;
    }
    
}
