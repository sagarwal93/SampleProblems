package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/31/16.
 */
public class InsertionSort {

    public static void insertIntoSorted(int[] ar) {
        int j, num;
        for (int i = 1; i < ar.length; i++) {
            j = i;
            num = ar[j];
            while (j > 0 && (num < ar[j-1])) {
                ar[j] = ar[j-1];
                j--;
                printArray(ar);
            }

            ar[j] = num;
        }

        printArray(ar);
    }

//    public static void insertIntoSorted(int[] ar) {
//        int j, temp;
//        for (int i = 1; i < ar.length; i++) {
//            j = i;
//            while (j > 0 && (ar[j] < ar[j-1])) {
//                temp = ar[j-1];
//                ar[j-1] = ar[j];
//                ar[j] = temp;
//                j--;
//            }
//        }
//    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
