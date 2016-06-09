package Test;

import Main.Knapsack;
import org.junit.Assert;

/**
 * Created by Samarth on 6/7/16.
 */
public class KnapsackTest {

    @org.junit.Test
    public void largestSumTest() {

        int[] items = new int[] {3, 4, 4, 4, 8};
        int sum = 9;

        int largest = Knapsack.largestSum(sum, items);

        Assert.assertTrue(largest == 9);
    }

    @org.junit.Test
    public void largestSumTest2() {

        int[] items = new int[] {1, 6, 9};
        int sum = 12;

        int largest = Knapsack.largestSum(sum, items);

        Assert.assertTrue(largest == 12);
    }


}
