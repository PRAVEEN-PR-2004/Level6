package Dynamicprog;

import java.util.*;

public class Pascal {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = pascal(n);
        System.out.println(ans.toString());
        sc.close();
    }
    public static List<List<Integer>> pascal(int n)
    {
        List<List<Integer>> triangle = new ArrayList<>();
        if(n==0)
        {
            return triangle;
        }
        for(int i=0;i<n;i++)
        {
            List<Integer> current = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    current.add(1);
                }
                else
                {
                    List<Integer> previous = triangle.get(i-1);
                    current.add(previous.get(j)+previous.get(j-1));
                }
            }
            triangle.add(current);
        }
        return triangle;
    }
}
