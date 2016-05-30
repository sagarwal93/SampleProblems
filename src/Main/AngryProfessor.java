package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/30/16.
 */
public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            System.out.println(isClassCanceled(k, a));
        }
    }

    public static String isClassCanceled(int threshold, int[] arrivals) {

        int onTime = 0;

        for (int i = 0; i < arrivals.length; i++) {
            if (arrivals[i] <= 0) {
                onTime++;
            }
        }

        return onTime >= threshold ? "NO" : "YES";
    }
}
