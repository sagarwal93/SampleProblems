package Test;

import Main.PlusMinus;
import org.junit.Assert;

/**
 * Created by Samarth on 5/29/16.
 */
public class PlusMinusTest {

    @org.junit.Test
    public void plusMinusTest() {
        double[] res = PlusMinus.plusMinus(new int[] {-4, 3, -9, 0, 4, 1});
        Assert.assertTrue(res[0] == 0.5);
        Assert.assertTrue(res[1] < 0.333334 && res[1] > 0.333332);
        Assert.assertTrue(res[2] < 0.166668 && res[2] > 0.166666);
    }

}
