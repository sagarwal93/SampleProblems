package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/30/16.
 */
public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(getHeightOfTree(n));
        }
    }

    public static int getHeightOfTree(int cycles) {
        int height = 1;
        for(int cycle = 1; cycle <= cycles; cycle++) {
            if (cycle % 2 == 1) {
                height *= 2;
            }
            else {
                height += 1;
            }
        }

        return height;
    }

}
