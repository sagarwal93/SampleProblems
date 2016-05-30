package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/29/16.
 */
public class PlusMinus {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i ++) {
            arr[i] = in.nextInt();
        }

        double[] res = plusMinus(arr);
        System.out.println(res[0]);
        System.out.println(res[1]);
        System.out.println(res[2]);
    }

    public static double[] plusMinus(int[] arr) {
        double[] res = new double[3];
        int pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > 0) {
                pos++;
            }
            else if (arr[i] < 0) {
                neg++;
            }
            else {
                zero++;
            }
        }

        res[0] = ((double) pos)/arr.length;
        res[1] = ((double) neg)/arr.length;
        res[2] = ((double) zero)/arr.length;

        return res;
    };

}
