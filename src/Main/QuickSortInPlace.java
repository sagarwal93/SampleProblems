package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/31/16.
 */
public class QuickSortInPlace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int pIdx = partition(array, l, r);
            quickSort(array, l, pIdx - 1);
            quickSort(array, pIdx + 1, r);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        for (int j = left; j <= right; j++) {
            if (array[j] <= pivot) {
                int temp = array[j];
                array[j] = array[left];
                array[left] = temp;
                left++;
            }
        }
        print(array);
        return left - 1;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(Integer.toString(array[i]) + " ");
        }
        System.out.println("");
    }
}
