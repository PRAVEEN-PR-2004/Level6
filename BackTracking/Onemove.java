package BackTracking;


import java.util.*;
public class Onemove
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[8][8];
        ArrayList<String> al = new ArrayList<>();
        int x = 0;
        int y=0;
        int d1 = 0;
        int d2 = 0;
        for(int i=0;i<8;i++)
        {
            String str = sc.nextLine();
            String s = str.substring(3);
                   String[] arr = s.split(",");
                for(String ss: arr)
                {
           
                    al.add(ss);
      
                }
        }
        int w=0;
       for(int i=0;i<8;i++)
       {
           for(int j=0;j<8;j++)
           {
               if(al.get(w).equals("1")) mat[i][j] =1;
               if(al.get(w).equals("0")) mat[i][j] =0;
               if(al.get(w).equals("S"))
               {
                   x=i;
                   y=j;
                   mat[i][j]=0;
               }
               if(al.get(w).equals("X"))
               {
                  
                   d1=i;
                   d2=j;
                   mat[i][j]=0;
               }
                w++;
           }
       }
  
       if(path(x,y,d1,d2,mat)==true)
       {
           System.out.print("YES");
       }
       else
       {
           System.out.print("NO");
       }
       
    sc.close();
}

    public static boolean path(int s1,int s2,int d1,int d2,int[][] mat)
    {
        if(s1==d1 && s2==d2 && mat[s1][s2]==0)
        {
            mat[s1][s2] = 1;
            return true;
        }
        if(s1>=0 && s2>=0 && s1<8 && s2<8 && mat[s1][s2] == 0) 
        {
            mat[s1][s2] = 1;
           if (path(s1 + 2, s2 - 1,d1,d2, mat)== true) {
                return true;
            }
            if (path(s1 + 1, s2 - 2,d1,d2, mat)== true) {
                return true;
            }
            if (path(s1 + 2, s2 + 1,d1,d2, mat)== true) {
                return true;
            }
            if (path(s1 + 1, s2 + 2,d1,d2 , mat)== true) {
                return true;
            }
            if (path(s1 - 2, s2 + 1,d1,d2,  mat)== true) {
                return true;
            }
            if (path(s1 - 1, s2 + 2,d1,d2,  mat)== true) {
                return true;
            }
            if (path(s1 - 2, s2 - 1,d1,d2,mat)== true) {
                return true;
            }
            if (path(s1 - 1, s2 - 2, d1,d2,mat)== true) {
                return true;
            }
           
        }
        return false;
    }









}
