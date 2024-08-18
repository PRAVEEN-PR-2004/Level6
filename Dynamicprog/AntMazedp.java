package Dynamicprog;

import java.util.*;

public class AntMazedp {
    static int n, m;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sol[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sol[i][j] == 0) {
                    int val = mat[i][j] + 1;
                    maximumLength(mat, sol, i, j, val, 1);
                }
            }
        }
        System.out.print(max );
    }

    static void maximumLength(int mat[][], int sol[][], int x, int y, int val, int count) {
        if (x < 0 || x >= n || y < 0 || y >= m || sol[x][y] != 0 || Math.abs(val - mat[x][y]) != 1) {
            return;
        }

        sol[x][y] = count;
        max = Math.max(max, count);

        maximumLength(mat, sol, x + 1, y, mat[x][y], count + 1);
        maximumLength(mat, sol, x, y + 1, mat[x][y], count + 1);
        maximumLength(mat, sol, x - 1, y, mat[x][y], count + 1);
        maximumLength(mat, sol, x, y - 1, mat[x][y], count + 1);

        sol[x][y] = 0; // Reset the cell after the recursive call for backtracking
    }
}
