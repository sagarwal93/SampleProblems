package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/30/16.
 */
public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int f = in.nextInt();
            int s = in.nextInt();
            System.out.println(getNumberOfSquares(f, s));
        }
    }

    public static int getNumberOfSquares(int first, int second) {
        int count = 0;
        int num = 1;
        int square = num*num;

        while (square < first) {
            num++;
            square = num*num;
        }

        while (square <= second) {
            count++;
            num++;
            square = num*num;
        }

        return count;
    }
}
