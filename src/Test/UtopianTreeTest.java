package Test;

import Main.UtopianTree;
import org.junit.Assert;

/**
 * Created by Samarth on 5/30/16.
 */
public class UtopianTreeTest {

    @org.junit.Test
    public void getHeightTest() {
        int cycles = 0;
        int height = UtopianTree.getHeightOfTree(cycles);

        Assert.assertTrue(height == 1);
    }

    @org.junit.Test
    public void getHeightTest2() {
        int cycles = 1;
        int height = UtopianTree.getHeightOfTree(cycles);

        Assert.assertTrue(height == 2);
    }

    @org.junit.Test
    public void getHeightTest3() {
        int cycles = 2;
        int height = UtopianTree.getHeightOfTree(cycles);

        Assert.assertTrue(height == 3);
    }

    @org.junit.Test
    public void getHeightTest4() {
        int cycles = 4;
        int height = UtopianTree.getHeightOfTree(cycles);

        Assert.assertTrue(height == 7);
    }
}
