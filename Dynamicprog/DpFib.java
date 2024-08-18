package Dynamicprog;
import java.util.*;

class DpFib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        if(n==0)
        {
            System.out.print(0);
        }
        if(n==1)
        {
            System.out.print(1);
        }
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n;i++)
        {
            arr[i] = arr[i-1]+arr[-2];
        }
        System.out.print(n);
        
        sc.close();
    }
}