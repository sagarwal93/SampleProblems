package Main;

import java.util.Objects;

/**
 * Created by Samarth on 5/30/16.
 */
public class TimeConversion {

    public static void main(String[] args) {

    }

    public static String convertToMilitaryTime(String time) {
        String meridian = time.substring(time.length() - 2, time.length());

        String hourString = getHourString(meridian, time.substring(0, 2));

        String militaryTime = hourString + time.substring(2, 8);

        return militaryTime;
    }

    private static String getHourString(String meridian, String hour) {

        if (Objects.equals(meridian, "AM")) {
            if (Objects.equals(hour, "12")) {
                return "00";
            }

            return hour;
        }

        int hourVal = Integer.parseInt(hour);
        if (hourVal < 12) {
            hourVal += 12;
        }

        return Integer.toString(hourVal);
    }

}
