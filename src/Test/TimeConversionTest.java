package Test;

import Main.TimeConversion;
import org.junit.Assert;

import java.util.Objects;

/**
 * Created by Samarth on 5/30/16.
 */
public class TimeConversionTest {

    @org.junit.Test
    public void timeConversionTest() {
        String time = "07:05:45PM";
        String militaryTime = TimeConversion.convertToMilitaryTime(time);
        Assert.assertTrue(Objects.equals(militaryTime, "19:05:45"));
    }

    @org.junit.Test
    public void timeConversionTest2() {
        String time = "12:05:45AM";
        String militaryTime = TimeConversion.convertToMilitaryTime(time);
        Assert.assertTrue(Objects.equals(militaryTime, "00:05:45"));
    }

    @org.junit.Test
    public void timeConversionTest3() {
        String time = "12:05:45PM";
        String militaryTime = TimeConversion.convertToMilitaryTime(time);
        Assert.assertTrue(Objects.equals(militaryTime, "12:05:45"));
    }

}
