package level5;
import java.util.*;
public class ABonly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "( `(ab)";
        StringBuilder ss = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                ss.append(str.charAt(i));
            }
        }
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                st.push(str.charAt(i));
            }
            else 
            {
                if(str.charAt(i)==')')
                {
                    if(!st.isEmpty())
                    {
                        sb.append(st.pop());
                        sb1.append(str.charAt(i));
                    }
                }
                
            }
        }
        String first = sb.toString();
        String first1 = sb1.toString();
        String second = ss.toString();
        
        String res = first + second + first1;
        System.out.println(res);
        
        sc.close();
        }
        
    }
