package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/28/16.
 */
public class VeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int count;
        count = in.nextInt();

        long arr[] = new long[count];
        for(int i = 0; i < count; i++) {
            arr[i] = in.nextLong();
        }

        System.out.println(getVeryBigSum(arr));
    }

    public static long getVeryBigSum(long[] arr) {
        long sum = 0;

        for (int idx = 0; idx < arr.length; idx ++) {
            sum += arr[idx];
        }

        return sum;
    }

}
