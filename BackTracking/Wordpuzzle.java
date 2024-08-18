// package BackTracking;
// import java.util.*;
// public class Wordpuzzle{
//     static char str[][]={{'A','B','C','I'},{'B','I','C','S'},{'C','D','E','E'}};
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int ix = 0 ; ix < n ; ix ++)
//         {
//             String s = sc.next();
//             int x=0,y=0,c = 0 ,l=s.length();
//             boolean found = false;
//             for(int i = 0 ; i < 3 ; i++)
//             {
//                 for(int j = 0 ; j < 4 ; j ++)
//                 {
//                     if(str[i][j]==s.charAt(0))
//                     {
//                         x=i;
//                         y=j;
//                         found = true;
//                         break;
//                     }
//                 }
//             }
//             if(found)
//             {
//             int sol[][]= new int[3][4];
//             if(search(x,y,c,l,sol,s)) System.out.println("True");
//             else System.out.println("False");
//             }
//             else
//             {
//                 System.out.println("False");
//             }
//         }
//     }
//     static boolean search(int x , int y,int c, int l,int sol[][],String s)
//     {
//         if(c==l)
//         {
//             return true;
//         }
//         if(x>=0 && x<3 && y>=0 && y<4 && sol[x][y]==0 && str[x][y]==s.charAt(c))
//         {
//             sol[x][y]=1;
//             if(search(x,y+1,c+1,l,sol,s)) return true;
//             if(search(x+1,y,c+1,l,sol,s)) return true;
//             if(search(x,y-1,c+1,l,sol,s)) return true;
//             if(search(x-1,y,c+1,l,sol,s)) return true;
//             sol[x][y]=0;
//             return false;
//         }
//         return false;
//     }
// }