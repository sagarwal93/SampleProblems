package Test;

import Main.SherlockAndSquares;
import org.junit.Assert;

/**
 * Created by Samarth on 5/30/16.
 */
public class SherlockAndSquaresTest {

    @org.junit.Test
    public void getNumberOfSquaresTest() {
        int count = SherlockAndSquares.getNumberOfSquares(3, 9);
        Assert.assertTrue(count == 2);
    }

    @org.junit.Test
    public void getNumberOfSquaresTest2() {
        int count = SherlockAndSquares.getNumberOfSquares(17, 24);
        Assert.assertTrue(count == 0);
    }

    @org.junit.Test
    public void getNumberOfSquaresTest3() {
        int count = SherlockAndSquares.getNumberOfSquares(15, 24);
        Assert.assertTrue(count == 1);
    }

    @org.junit.Test
    public void getNumberOfSquaresTest4() {
        int count = SherlockAndSquares.getNumberOfSquares(4, 9);
        Assert.assertTrue(count == 2);
    }
}
