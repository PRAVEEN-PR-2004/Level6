package Dynamicprog;

import java.util.*;

public class CanSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pro = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        List<List<Integer>>a = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            pro[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean[] tf = new boolean[target+1];
        tf[0] = true;
        for(int i=1;i<=target;i++)
        {
            for(int j=0;j<pro.length;j++)
            {
                
                if(i>=pro[j] && tf[i-pro[j]])
                {
                    tf[i]=true;
                    al.add(pro[j]);
                }
                a.add(al);
                al.clear();
            }
        }
        System.out.println(al.toString());
        if(tf[target]) 
        {
            System.out.print(true);
        }
        else System.out.println(false);
        sc.close();

    }
    
}
