package Test;

import Main.FindDigits;
import org.junit.Assert;

/**
 * Created by Samarth on 5/30/16.
 */
public class FindDigitsTest {

    @org.junit.Test
    public void findNumberOfDivisibleDigitsTest() {
        int num = 12;
        int count = FindDigits.findNumberOfDivisibleDigits(num);

        Assert.assertTrue(count == 2);
    }

    @org.junit.Test
    public void findNumberOfDivisibleDigitsTest2() {
        int num = 1012;
        int count = FindDigits.findNumberOfDivisibleDigits(num);

        Assert.assertTrue(count == 3);
    }

    @org.junit.Test
    public void findNumberOfDivisibleDigitsTest3() {
        int num = 2025;
        int count = FindDigits.findNumberOfDivisibleDigits(num);

        Assert.assertTrue(count == 1);
    }
}
