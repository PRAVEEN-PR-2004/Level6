package gametheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ashisandjeel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int ix = 0 ; ix < m ; ix++)
        {
            int n = sc.nextInt();
            int arr[] =new int[n];
            ArrayList<Integer>  le = new ArrayList<>();
            ArrayList<Integer> ri  = new ArrayList<>();
            for(int i = 0 ; i < n ; i++)
            {
                arr[i]=sc.nextInt();
                ri.add(arr[i]);
            }
            int left = 0,right=0;
            long turn =1;
            check(le,ri,n,left,right,turn);
        }
    sc.close();
    }
    static int check(ArrayList<Integer> le,ArrayList<Integer> ri,int n ,int left,int right,long turn)
    {
        for(int i =  0; i < n-1; i++)
        {
             le.add(ri.remove(0));
            int min = Collections.min(ri);
            int max = Collections.max(le);
            if(max < min)
            {
                turn++;
            }
        }
        if(turn%2==0)
        {
          System.out.println("Jeel");
          return 0 ;
        }
        else
        {
           System.out.println("Ashish");
            return 0;
        }
    }
    
}
