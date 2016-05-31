package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/30/16.
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        int count = in.nextInt();

        int[] arr = new int[count];

        for (int idx = 0; idx < count; idx ++) {
            arr[idx] = in.nextInt();
        }

        System.out.println(findValueIndex(arr, val));

    }

    public static int findValueIndex(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;
        int index = (left + right)/2;
        int oldIndex = 0;

        while (arr[index] != val) {
            oldIndex = index;
            if (arr[index] > val) {
                right = index - 1;
            }
            else {
                left = index + 1;
            }

            index = (right + left)/2;
            if (index == oldIndex) {
                return -1;
            }

        }

        return index;
    }

}
