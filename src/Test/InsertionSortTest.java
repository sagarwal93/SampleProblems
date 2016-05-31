package Test;

import Main.InsertionSort;
import org.junit.Assert;

import java.util.Objects;

/**
 * Created by Samarth on 5/31/16.
 */
public class InsertionSortTest {

    @org.junit.Test
    public void insertionSortTest() {
        int[] ar = new int[] {2, 4, 6, 8, 3};
        InsertionSort.insertIntoSorted(ar);

        int[] sortedAr = new int[] {2, 3, 4, 6, 8};
        for (int i = 0; i < ar.length; i++) {
            Assert.assertTrue(ar[i] == sortedAr[i]);
        }
    }

}
