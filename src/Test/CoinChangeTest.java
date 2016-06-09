package Test;

import Main.CoinChange;
import org.junit.Assert;

/**
 * Created by Samarth on 6/6/16.
 */
public class CoinChangeTest {

    @org.junit.Test
    public void coinChangeTest() {
        int[] coins = new int[] {2, 3, 4};
        int num = 8;
        long poss = CoinChange.coinChangePermutations(num, coins);

        Assert.assertTrue(poss == 4);
    }

    @org.junit.Test
    public void coinChangeTest2() {
        int[] coins = new int[] {1, 2, 3};
        int num = 4;
        long poss = CoinChange.coinChangePermutations(num, coins);

        Assert.assertTrue(poss == 4);
    }

    @org.junit.Test
    public void coinChangeTest3() {
        int[] coins = new int[] {2, 5, 3, 6};
        int num = 10;
        long poss = CoinChange.coinChangePermutations(num, coins);

        Assert.assertTrue(poss == 5);
    }

    @org.junit.Test
    public void coinChangeTest4() {
        int[] coins = new int[] {16, 30, 9, 17, 40, 13, 42, 5, 25, 49, 7, 23, 1, 44, 4, 11, 33, 12, 27, 2, 38, 24, 28, 32, 14, 50};
        int num = 245;
        long poss = CoinChange.coinChangePermutations(num, coins);

        Assert.assertTrue(poss == 64027917156L);
    }
}
