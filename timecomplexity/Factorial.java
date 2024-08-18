package timecomplexity;

import java.util.*;


public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long st = n*3;
        int c=0;
        ArrayList<Long> al = new ArrayList<>();
        while(c<=n)
        {

            Long tem = st;
            c=0;
            while(tem!=0)
            {
                tem = tem/5;
                c+=tem;
            }
            if(c==n)
            {
                al.add(st); 
            }
           st++;    
        }
      System.out.println(al.toString());
      sc.close();
    }
}
