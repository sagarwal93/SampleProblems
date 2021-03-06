package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/28/16.
 */
public class SimpleArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int count;
        count = in.nextInt();

        int arr[] = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(getSimpleArraySum(arr));
    }

    public static int getSimpleArraySum(int[] arr) {
        int sum = 0;

        for (int idx = 0; idx < arr.length; idx ++) {
            sum += arr[idx];
        }

        return sum;
    }

}
