package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1=LocalTime.of(16,30);
        System.out.println(time1.format(dtf));

        LocalTime time2=LocalTime.of(10,0);
        System.out.println(time2.format(dtf));

        boolean result1=time1.isAfter(time2);
        System.out.println(result1);

    }
}

