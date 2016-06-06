package Main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Samarth on 6/5/16.
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int tNum = 0; tNum < t; tNum++) {
            int count = in.nextInt();
            int[] arr = new int[count];
            for (int i = 0; i < count; i++) {
                arr[i] = in.nextInt();
            }

            System.out.println(maximumSubArray(arr) + " " + maximumPositiveSum(arr));
        }
    }

    public static int maximumPositiveSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }

        if (sum == 0) {
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > min) {
                    min = arr[i];
                }
            }

            return min;
        }

        return sum;
    }

    public static int maximumSubArray(int[] arr) {

        int contiguousSum = 0;
        int[] sumArr = new int[arr.length];
        Arrays.fill(sumArr, Integer.MIN_VALUE);

        for (int idx = 0; idx < arr.length; idx++) {

            contiguousSum += arr[idx];

            if (contiguousSum > arr[idx]) {
                sumArr[idx] = contiguousSum;
            }
            else {
                sumArr[idx] = arr[idx];
                contiguousSum = arr[idx];
            }
        }

        int max = sumArr[0];
        for (int idx = 0; idx < sumArr.length; idx ++) {
            if (sumArr[idx] > max) {
                max = sumArr[idx];
            }
        }

        return max;
    }

}
