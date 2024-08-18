package Dynamicprog;

import java.util.Scanner;

public class Cansum2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of elements in array
        int[] pro = new int[n];

        for (int i = 0; i < n; i++) {
            pro[i] = sc.nextInt(); 
        }

        int target = sc.nextInt(); 

        boolean[] tf = new boolean[target + 1];
        tf[0] = true; 
        for(int i=0;i<=target;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+pro[j])<=target && tf[i])
                {
                    tf[i+pro[j]]= true;
                }
            }
        }
       

       

        
        System.out.println(tf[target]); 
        sc.close();
    }
}
