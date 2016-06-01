package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Samarth on 5/31/16.
 */
public class QuickSort {

    // This is the hacker rank accepted solution
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        int index = 0;
        while (scanner.hasNextInt()) {
            array[index++] = scanner.nextInt();
        }

        quickSort(array, 0, array.length);
    }

    public static void quickSort(int[] array, int left, int right) {

        if (right - left >= 2) {
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot);
            quickSort(array, (pivot + 1), right);
            print(array, left, right);
        }
    }

    public static int partition(int[] array, int left, int right) {

        int pivot = array[left];
        List<Integer> smallerElements = new ArrayList<Integer>(array.length);
        List<Integer> largerElements = new ArrayList<Integer>(array.length);

        for (int i = left + 1; i < right; ++i) {
            if (array[i] < pivot) {
                smallerElements.add(array[i]);
            } else {
                largerElements.add(array[i]);
            }
        }

        for (int i = 0; i < smallerElements.size(); ++i) {
            array[left + i] = smallerElements.get(i);
        }

        array[left + smallerElements.size()] = pivot;

        for (int i = 0; i < largerElements.size(); ++i) {
            array[left + smallerElements.size() + 1 + i] = largerElements.get(i);
        }

        return left + smallerElements.size();
    }

    public static void print(int[] array, int left, int right) {
        for (int i = left; i < right; ++i) {
            System.out.print(Integer.toString(array[i]) + " ");
        }
        System.out.println("");
    }
}
