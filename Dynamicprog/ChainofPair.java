package Dynamicprog;


import java.util.*;

public class ChainofPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of test cases

        for (int p = 0; p < n; p++) {
            int k = sc.nextInt();  // Number of pairs
            int[] arr = new int[k * 2];  // Array to store pairs
            int[] lis = new int[k];  // LIS array initialized to 1

            // Reading pairs into arr
            for (int i = 0; i < k * 2; i++) {
                arr[i] = sc.nextInt();
            }

            // Initialize LIS array with 1
            for (int i = 0; i < k; i++) {
                lis[i] = 1;
            }

            // Finding the LIS for the pairs
            for (int i = 2; i < k * 2; i += 2) {
                for (int j = 1; j < i; j += 2) {
                    if (arr[i] > arr[j]) {
                        lis[i / 2] = Math.max(lis[i / 2], lis[j / 2] + 1);
                    }
                }
            }

            // Finding the maximum value in LIS array
            int maxLength = 0;
            for (int i = 0; i < k; i++) {
                maxLength = Math.max(maxLength, lis[i]);
            }

            // Output the result for this test case
            System.out.println(maxLength);
        }
    }
}
