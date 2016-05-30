package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/29/16.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dim = in.nextInt();
        int count = dim*dim;
        int[][] grid = new int[dim][dim];

        for (int i = 0; i < count; i++) {
            int r = i/dim;
            int c = i%dim;
            grid[r][c] = in.nextInt();
        }

        System.out.println(diagonalDifference(grid));
    }

    public static int diagonalDifference(int[][] grid) {
        int pSum = 0;
        for (int r = 0; r < grid.length; r++) {
            int c = r;
            pSum += grid[r][c];
        }

        int sSum = 0;
        for (int r = 0; r < grid.length; r++) {
            int c = grid[0].length - r - 1;
            sSum += grid[r][c];
        }

        return Math.abs(pSum - sSum);
    }

}
