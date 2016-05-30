package Test;

import Main.AngryProfessor;
import org.junit.Assert;

import java.util.Objects;

/**
 * Created by Samarth on 5/30/16.
 */
public class AngryProfessorTest {

    @org.junit.Test
    public void angryProfessorTest() {
        int[] a = new int[] {-1, -3, 4, 2};
        String res = AngryProfessor.isClassCanceled(3, a);
        Assert.assertTrue(Objects.equals(res, "YES"));
    }

    @org.junit.Test
    public void angryProfessorTest2() {
        int[] a = new int[] {0, -1, 2, 1};
        String res = AngryProfessor.isClassCanceled(2, a);
        Assert.assertTrue(Objects.equals(res, "NO"));
    }
}
