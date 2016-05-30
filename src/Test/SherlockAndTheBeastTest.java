package Test;

import Main.SherlockAndTheBeast;
import org.junit.Assert;

import java.util.Objects;

/**
 * Created by Samarth on 5/30/16.
 */
public class SherlockAndTheBeastTest {

    @org.junit.Test
    public void getDecentNumberTest() {
        int digits = 1;
        String str = SherlockAndTheBeast.getDecentNumber(digits);
        Assert.assertTrue(Objects.equals(str, "-1"));
    }

    @org.junit.Test
    public void getDecentNumberTest1() {
        int digits = 3;
        String str = SherlockAndTheBeast.getDecentNumber(digits);
        Assert.assertTrue(Objects.equals(str, "555"));
    }

    @org.junit.Test
    public void getDecentNumberTest2() {
        int digits = 5;
        String str = SherlockAndTheBeast.getDecentNumber(digits);
        Assert.assertTrue(Objects.equals(str, "33333"));
    }

    @org.junit.Test
    public void getDecentNumberTest3() {
        int digits = 11;
        String str = SherlockAndTheBeast.getDecentNumber(digits);
        Assert.assertTrue(Objects.equals(str, "55555533333"));
    }

}
