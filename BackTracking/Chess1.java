package BackTracking;

import java.util.*;

public class Chess1 {
    static int mincount = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt()-1;
        int s2 = sc.nextInt()-1;
        int des1 = sc.nextInt()-1;
        int des2 = sc.nextInt()-1;
       
        int[][] mat = new int[8][8];
        path(s1, s2, des1, des2, mat, 0);
        System.out.print(mincount);
        sc.close();
    }

    public static boolean path(int s1, int s2, int des1, int des2, int[][] mat, int count) {
        if (s1 == des1 && s2 == des2 && mat[s1][s2] == 0) {
            mat[s1][s2] = 1;
            if (count < mincount ) 
            {
                mincount = count;
            }
            mat[s1][s2] = 0;
            return false;
        }

        if ((s1 >= 0 && s1<8) && (s2>=0 && s2<8) && mat[s1][s2] == 0 && count<mincount) {
            mat[s1][s2] = 1;

            if (path(s1 + 2, s2 - 1, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 + 1, s2 - 2, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 + 2, s2 + 1, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 + 1, s2 + 2, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 - 2, s2 + 1, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 - 1, s2 + 2, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 - 2, s2 - 1, des1, des2, mat, count + 1)) {
                return true;
            }
            if (path(s1 - 1, s2 - 2, des1, des2, mat, count + 1)) {
                return true;
            }

            mat[s1][s2] = 0;
            return false;
        }
        return false;
    }
}
