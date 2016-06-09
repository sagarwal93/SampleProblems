package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 6/6/16.
 */
public class CoinChange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int numCoins = in.nextInt();
        int[] coins = new int[numCoins];

        for (int c = 0; c < numCoins; c++) {
            coins[c] = in.nextInt();
        }

        long poss = coinChangePermutations(num, coins);
        System.out.println(poss);
    }

    public static long coinChangePermutations(int num, int[] coins) {

        long arr[][] = new long[coins.length][num+1];

        for (int c = 0; c < coins.length; c++) {
            for (int n = 1; n < num + 1; n++) {

                long ans = 0;

                // Using the existing coin
                if (n == coins[c]) {
                    ans += 1;
                }

                if (c - 1 >= 0) {
                    ans += arr[c - 1][n];
                }

                if (n - coins[c] >= 0) {
                    ans += arr[c][n - coins[c]];
                }

                arr[c][n] = ans;
            }
        }

        return arr[coins.length - 1][num];
    }

}
