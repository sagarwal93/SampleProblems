package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/30/16.
 */
public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(findNumberOfDivisibleDigits(n));
        }
    }

    public static int findNumberOfDivisibleDigits(int num) {

        int count = 0;
        int origNum = num;

        while (num > 0) {
            int digit = num % 10;
            num = num/10;

            if (digit == 0) {
                continue;
            }

            if (origNum % digit == 0) {
                count++;
            }
        }

        return count;
    }
}
