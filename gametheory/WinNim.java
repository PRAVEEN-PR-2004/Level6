package gametheory;

import java.util.Scanner;

public class WinNim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(canWinNim(n));  // prints true or false based on the input value of n
    sc.close();
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
