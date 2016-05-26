package Test;
import Main.SquareRoot;
import org.junit.Assert;

/**
 * Created by Samarth on 5/26/16.
 */
public class SquareRootTest {

    @org.junit.Test
    public void squareRootTest() {
        double sqrt = SquareRoot.getSquareRoot(25.0, 0.0001);
        Assert.assertTrue((sqrt < 5.01 && sqrt > 4.99));
    }

    @org.junit.Test
    public void squareRootTestNegative() {
        double sqrt = SquareRoot.getSquareRoot(-4, 0);
        Assert.assertTrue((sqrt < 0));
    }
}