package Test;

import Main.VeryBigSum;
import org.junit.Assert;

/**
 * Created by Samarth on 5/28/16.
 */
public class VeryBigSumTest {

    @org.junit.Test
    public void veryBigSumTest() {
        long sum = VeryBigSum.getVeryBigSum(new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005});
        Assert.assertTrue(sum == 5000000015L);
    }

}
