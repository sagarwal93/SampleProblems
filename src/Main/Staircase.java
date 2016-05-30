package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/29/16.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printStaircase(n);
    }

    private static void printStaircase(int steps) {

        for (int i = 1; i <= steps; i++) {
            String spaces = new String(new char[steps - i]).replace("\0", " ");
            String hashes = new String(new char[i]).replace("\0", "#");
            System.out.println(spaces + hashes);
        }
    }
}
