package gametheory;


import java.util.*;
public class Rama
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine().replace("[","").replace("]","");
        String[] arr = str.split(",");
        ArrayList<Integer> al = new ArrayList<>();
        
        int sum1 =0;
        int sum2 = 0;
        for(String s: arr)
        {
            al.add(Integer.parseInt(s));
        }
        boolean turn = true;
        for(int i=0;i<al.size();i++)
        {
            if(turn)
            {
            int ramm = al.get(i);
            sum1 = sum1+ramm;
            turn = !turn;
                
            }
            else
            {
             int kriss = al.get(i);
            sum2 = sum2+kriss;
            turn = !turn;
            }
        }
        
       
       
        if(sum1>sum2)
        {
            System.out.print(true);
        }
        else if(sum1<sum2)
        {
            System.out.print(false);
        }
        else if(sum1 == sum2)
        {
            System.out.print(false);
        }
        
        
        
       
        sc.close();
    }
}