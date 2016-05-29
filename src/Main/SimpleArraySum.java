package Main;

/**
 * Created by Samarth on 5/28/16.
 */
public class SimpleArraySum {

    public static int getSimpleArraySum(int[] arr) {
        int sum = 0;

        for (int idx = 0; idx < arr.length; idx ++) {
            sum += arr[idx];
        }

        return sum;
    }

}
