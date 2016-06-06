package Test;

import Main.MaximumSubArray;
import org.junit.Assert;

/**
 * Created by Samarth on 6/5/16.
 */
public class MaximumSubArrayTest {

    @org.junit.Test
    public void maximumSubArrayTest() {

        int[] arr = new int[] {2, -1, 2, 3, 4, -5};
        int sum = MaximumSubArray.maximumSubArray(arr);

        Assert.assertTrue(sum == 10);
    }

    @org.junit.Test
    public void maximumSubArrayTest2() {

        int[] arr = new int[] {1, 2, 3, 4};
        int sum = MaximumSubArray.maximumSubArray(arr);

        Assert.assertTrue(sum == 10);
    }

    @org.junit.Test
    public void maximumSubArrayTest3() {

        int[] arr = new int[] {2, 3, -10, 10, -5, 4, 6};
        int sum = MaximumSubArray.maximumSubArray(arr);

        Assert.assertTrue(sum == 15);
    }
}
