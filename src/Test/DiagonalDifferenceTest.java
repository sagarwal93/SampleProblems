package Test;

import Main.DiagonalDifference;
import org.junit.Assert;

/**
 * Created by Samarth on 5/29/16.
 */
public class DiagonalDifferenceTest {

    @org.junit.Test
    public void diagonalDifferenceTest() {
        int[][] grid = new int[][] {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int diff = DiagonalDifference.diagonalDifference(grid);
        Assert.assertTrue(diff == 15);
    }

}
