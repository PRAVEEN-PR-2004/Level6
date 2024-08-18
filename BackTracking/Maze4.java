package BackTracking;
import java.util.Scanner;

public class Maze4 {
    static int flag = 0;
    static int mincount=10000;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int s = sc.nextInt();
        int e = sc.nextInt();
        int[][] pro = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                pro[i][j] = sc.nextInt();
            }
        }
        int[][] sol = new int[n][n];
        int[][] minpath = new int[n][n];
        path(s,e,n,pro,sol,minpath,1);
        if(flag==0)
        {
            System.out.print("No path exists");
        }
        else
        {
            System.out.println("Minimum Steps: "+ mincount);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(minpath[i][j] + " ");
                }System.out.println();
            }
        }
        sc.close();
       
    }
    public static boolean path(int x,int y,int n,int[][] pro,int[][] sol,int[][] minpath,int count)
    {
        if((x==0 && y==0) || (x==n-1&& y==n-1) || (x==0 && y==n-1) || (x==n-1&& y==0) && pro[x][y]==0)
        {
            sol[x][y] = 1;
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
            
        }
        if(x<n && y<n && x>=0 && y>=0 && pro[x][y]==0 && sol[x][y]==0)
        {
            sol[x][y] = 1;
            if(path(x+1,y,n,pro,sol,minpath,count+1)== true)
            {
                return true;
            }
            if(path(x,y+1,n,pro,sol,minpath,count+1)== true)
            {
                return true;
            }
            if(path(x-1,y,n,pro,sol,minpath,count+1)== true)
            {
                return true;
            }
            if(path(x,y-1,n,pro,sol,minpath,count+1)== true)
            {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
        
    }
}
