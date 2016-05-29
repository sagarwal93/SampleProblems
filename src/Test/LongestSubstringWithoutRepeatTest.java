package Test;

import Main.LongestSubstringWithoutRepeat;
import org.junit.Assert;

/**
 * Created by Samarth on 5/28/16.
 */
public class LongestSubstringWithoutRepeatTest {

    @org.junit.Test
    public void longestSubstringTest() {
        int count = LongestSubstringWithoutRepeat.findLongestSubstring("abcabcbb");
        Assert.assertTrue(count == 3);
    }

    @org.junit.Test
    public void longestSubstringTest2() {
        int count = LongestSubstringWithoutRepeat.findLongestSubstring("bbbbb");
        Assert.assertTrue(count == 1);
    }

    @org.junit.Test
    public void longestSubstringTest3() {
        int count = LongestSubstringWithoutRepeat.findLongestSubstring("pwwkew");
        Assert.assertTrue(count == 3);
    }

    @org.junit.Test
    public void longestSubstringTest4() {
        int count = LongestSubstringWithoutRepeat.findLongestSubstring("pwasasfdfdasdfwkew");
        Assert.assertTrue(count == 7);
    }
}
