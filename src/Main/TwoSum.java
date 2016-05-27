package Main;

import java.util.HashMap;

/**
 * Created by Samarth on 5/26/16.
 */
public class TwoSum {

    public static int[] getTwoSum(int[] list, int sum) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        for (int idx = 0; idx < list.length; idx++) {
            int diff = sum - list[idx];
            if (set.containsKey(list[idx])) {
                return new int[] {set.get(list[idx]), idx};
            }

            set.put(diff, idx);
        }

        return new int[] {};
    }

}
