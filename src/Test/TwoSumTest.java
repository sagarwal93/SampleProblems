package Test;
import Main.TwoSum;
import com.sun.deploy.util.ArrayUtil;
import org.junit.Assert;

import java.util.Arrays;

/**
 * Created by Samarth on 5/26/16.
 */
public class TwoSumTest {

    @org.junit.Test
    public void twoSumTest() {
        int[] idxs = TwoSum.getTwoSum(new int[] {2, 7, 11, 15}, 18);
        Assert.assertTrue(idxs[0] == 1);
        Assert.assertTrue(idxs[1] == 2);
    }
}
