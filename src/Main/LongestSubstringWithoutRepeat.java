package Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Samarth on 5/27/16.
 */
public class LongestSubstringWithoutRepeat {

    public static int findLongestSubstring(String input) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int ans = 0;

        for (int l = 0, r = 0; r < input.length(); r ++) {
            char curr = input.charAt(r);
            if (map.containsKey(curr)) {
                l = Math.max((map.get(curr) + 1), l);
            }

            ans = Math.max(ans, r - l);
            map.put(curr, r);
        }

        return ans + 1;
    }

}
