package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 6/7/16.
 */
public class Knapsack {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int tIdx = 0; tIdx < t; tIdx++) {
            int count = in.nextInt();
            int[] items = new int[count];
            int sum = in.nextInt();

            for (int i = 0; i < count; i++) {
                items[i] = in.nextInt();
            }

            System.out.println(largestSum(sum, items));
        }
    }

    public static int largestSum(int sum, int[] items) {

        boolean[] poss = new boolean[sum + 1];
        poss[0] = true;

        for (int s = 0; s < sum + 1; s++) {

            for (int i = 0; i < items.length; i++) {

                if (s - items[i] < 0) {
                    continue;
                }

                if (poss[s - items[i]]) {
                    poss[s] = true;
                    break;
                }
            }
        }

        for (int l = sum; l > -1; l--) {
            if (poss[l]) {
                return l;
            }
        }

        return 0;
    }
}
