package Main;

/**
 * Created by Samarth on 5/24/16.
 */

public class SquareRoot {

    public static double getSquareRoot(double num, double tolerance) {

        if (num < 0) {
            return -1.0;
        }

        return getSquareRootHelper(num, 0, num, tolerance);
    }

    private static double getSquareRootHelper(double num, double min, double max, double tolerance) {

        double rt = (min + max)/2;
        double sqr = rt*rt;

        if (checkSquare(num, sqr, tolerance)) {
            return rt;
        }
        else if (sqr > num) {
            return getSquareRootHelper(num, min, rt, tolerance);
        }
        else {
            return getSquareRootHelper(num, rt, max, tolerance);
        }
    }

    private static boolean checkSquare(double num, double sqr, double tolerance) {

        double diff = num - sqr;

        if (diff < 0) {
            diff = -diff;
        }

        if (diff <= tolerance) {
            return true;
        }

        return false;
    }
}
