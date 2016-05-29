package Test;

import Main.SimpleArraySum;
import org.junit.Assert;

/**
 * Created by Samarth on 5/28/16.
 */
public class SimpleArraySumTest {

    @org.junit.Test
    public void simpleArraySumTest() {
        int[] arr = new int[] {1, 2, 3, 4, 10, 11};
        int sum = SimpleArraySum.getSimpleArraySum(arr);
        Assert.assertTrue(sum == 31);
    }

    @org.junit.Test
    public void simpleArraySumTest2() {
        int[] arr = new int[] {1, 2, 3, 4};
        int sum = SimpleArraySum.getSimpleArraySum(arr);
        Assert.assertTrue(sum == 10);
    }

    @org.junit.Test
    public void simpleArraySumTest3() {
        int[] arr = new int[] {2, 3, 4, 10, 11, 60};
        int sum = SimpleArraySum.getSimpleArraySum(arr);
        Assert.assertTrue(sum == 90);
    }
}
