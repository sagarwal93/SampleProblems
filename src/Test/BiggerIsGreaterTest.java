package Test;

import Main.BiggerIsGreater;
import org.junit.Assert;

import java.util.Objects;

/**
 * Created by Samarth on 6/1/16.
 */
public class BiggerIsGreaterTest {

    @org.junit.Test
    public void getBiggerStringTest() {
        String input = "dkhc";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("hcdk", output));
    }

    @org.junit.Test
    public void getBiggerStringTest2() {
        String input = "dhkd";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("dkdh", output));
    }

    @org.junit.Test
    public void getBiggerStringTest3() {
        String input = "abgdc";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("acbdg", output));
    }

    @org.junit.Test
    public void getBiggerStringTest4() {
        String input = "bb";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("no answer", output));
    }

    @org.junit.Test
    public void getBiggerStringTest5() {
        String input = "ehdegnmorgafrjxvksc";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("ehdegnmorgafrjxvsck", output));
    }

    @org.junit.Test
    public void getBiggerStringTest6() {
        String input = "35025864711";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("35025867114", output));
    }

    @org.junit.Test
    public void getBiggerStringTest7() {
        String input = "gkbekyrhwcc";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("gkbekyrwcch", output));
    }

    @org.junit.Test
    public void getBiggerStringTest8() {
        String input = "jwwbeuiklpodvzii";
        String output = BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("jwwbeuiklpodziiv", output));
    }

    @org.junit.Test
    public void getBiggerStringTest9() {
        String input = "3574";
        String output =  BiggerIsGreater.getBiggerString(input);

        Assert.assertTrue(Objects.equals("3745", output));
    }
}
