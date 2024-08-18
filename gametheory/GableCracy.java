package gametheory;


import java.util.*;
public class GableCracy{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		String str =sc.next().replace("?",Integer.toString((int)(Math.random()*10)));
		int n = str.length()/2;
		
		String ss= str.substring(0,n);
		String sss= str.substring(n);
		int half1 = Integer.parseInt(ss);
		int half2 = Integer.parseInt(sss);
	
		int sum1=0;
		while(half1>0)
		{
		 int rem = half1%10;
		 sum1 = sum1+rem;
	
		 half1/=10;
		}
		
int sum2=0;

		while(half2>0)
		{
		 int rem = half2%10;
		 sum2 = sum2+rem;
	
		 half2/=10;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		
		if(sum1==sum2)
		{
			System.out.print(false);
		}
		else
		{
			System.out.print(true);
		}
		sc.close();
	}
   
}