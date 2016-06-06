package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Samarth on 6/1/16.
 */
public class BiggerIsGreater {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] strList = new String[count];
        for (int i = 0; i < count; i++) {
            strList[i] = in.next();
        }

        for (int i = 0; i < count; i++) {
            String out = getBiggerString(strList[i]);
            System.out.println(out);
        }

    }

    public static String getBiggerString(String input) {

        StringBuffer inBuff = new StringBuffer(input);
        int leftIdx = -1;
        int rightIdx = -1;

        // Find left idx to swap
        char curr = inBuff.charAt(input.length() - 1);
        for (int i = input.length() - 2; i > -1; i--) {
            if (inBuff.charAt(i) < curr) {
                leftIdx = i;
                break;
            }

            curr = inBuff.charAt(i);
        }

        if (leftIdx < 0) {
            return "no answer";
        }

        //Find right idx to swap if left exists
        rightIdx = leftIdx + 1;
        char min = (char) Integer.MAX_VALUE;
        for (int i = rightIdx; i < inBuff.length(); i++) {
            if (inBuff.charAt(i) > inBuff.charAt(leftIdx) && inBuff.charAt(i) < min) {
                min = inBuff.charAt(i);
                rightIdx = i;
            }
        }

        char temp = inBuff.charAt(rightIdx);
        inBuff.setCharAt(rightIdx, inBuff.charAt(leftIdx));
        inBuff.setCharAt(leftIdx, temp);

        quickSort(inBuff, leftIdx + 1, input.length());
        return inBuff.toString();
    }

    public static void quickSort(StringBuffer charArr, int left, int right) {

        if (right - left >= 2) {
            int pivot = partition(charArr, left, right);
            quickSort(charArr, left, pivot);
            quickSort(charArr, (pivot + 1), right);
        }
    }

    public static int partition(StringBuffer array, int left, int right) {

        char pivot = array.charAt(left);
        List<Character> smallerElements = new ArrayList<Character>(array.length());
        List<Character> largerElements = new ArrayList<Character>(array.length());

        for (int i = left + 1; i < right; ++i) {
            if (array.charAt(i) < pivot) {
                smallerElements.add(array.charAt(i));
            } else {
                largerElements.add(array.charAt(i));
            }
        }

        for (int i = 0; i < smallerElements.size(); ++i) {
            array.setCharAt(left + i, smallerElements.get(i));
        }

        array.setCharAt(left + smallerElements.size(), pivot);

        for (int i = 0; i < largerElements.size(); ++i) {
            array.setCharAt(left + smallerElements.size() + 1 + i, largerElements.get(i));
        }

        return left + smallerElements.size();
    }

}
