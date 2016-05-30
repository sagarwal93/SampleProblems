package Main;

import java.util.Scanner;

/**
 * Created by Samarth on 5/30/16.
 */
public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(getDecentNumber(n));
        }
    }

    public static String getDecentNumber(int numDigits) {
        int num5s = numDigits;
        int num3s = numDigits - num5s;

        while (num5s > -1) {

            int mod3 = num5s % 3;
            int mod5 = num3s % 5;

            if (mod5 == 0 && mod3 == 0) {
                return new String(new char[num5s]).replace("\0", "5") + new String(new char[num3s]).replace("\0", "3");
            }

            num5s--;
            num3s++;
        }

        return "-1";
    }

}
