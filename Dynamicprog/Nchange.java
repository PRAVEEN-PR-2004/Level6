package Dynamicprog;

import java.util.Scanner;

public class Nchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //conins
        int[] coins = new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] tb = new int[target+1];
        tb[0]=1;
        for(int c:coins)
        {
            for(int i=c;i<=target;i++)
            {
                tb[i]+=tb[i-c];
            }
        }
        System.out.print(tb[target]);
        sc.close();


    }
}
