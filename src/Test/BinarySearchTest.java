package Test;

import Main.BinarySearch;
import org.junit.Assert;

/**
 * Created by Samarth on 5/30/16.
 */
public class BinarySearchTest {

    @org.junit.Test
    public void binarySearchTest() {
        int index = BinarySearch.findValueIndex(new int[] {1, 4, 5, 7, 9, 12}, 4);
        Assert.assertTrue(index == 1);
    }

    @org.junit.Test
    public void binarySearchTest2() {
        int index = BinarySearch.findValueIndex(new int[] {1, 4, 5, 7, 9, 12}, 6);
        Assert.assertTrue(index == -1);
    }

    @org.junit.Test
    public void binarySearchTest3() {
        int index = BinarySearch.findValueIndex(new int[] {1, 4, 5}, 5);
        Assert.assertTrue(index == 2);
    }

}
