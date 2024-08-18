package Dynamicprog;

import java.util.*;

public class AntMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] pro = new int[n+1][m+1];
        int[][] sol = new int[n+1][m+1];

        // Read the matrix values
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                pro[i][j] = sc.nextInt();
            }
        }

        // Initialize starting point
        sol[1][1] = 1;

        // Calculate the solution matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i + 1 <= n && pro[i + 1][j] - pro[i][j] == 1) {
                    sol[i + 1][j] = Math.max(sol[i + 1][j], sol[i][j] + 1);
                }
                if (j + 1 <= m && pro[i][j + 1] - pro[i][j] == 1) {
                    sol[i][j + 1] = Math.max(sol[i][j + 1], sol[i][j] + 1);
                }
            }
        }

        // Print the solution matrix
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }

        // Find the maximum value in the solution matrix
        int maxPathLength = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                maxPathLength = Math.max(maxPathLength, sol[i][j]);
            }
        }

        System.out.println(maxPathLength);
    }
}
