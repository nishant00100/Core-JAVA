package Built_In_Methods;

import java.time.ZonedDateTime;
import java.time.ZoneId;
public class Time_Zones_and_ZonedDateTime {
    public static void main(String[] args) {
        // Get current time in GMT
        ZonedDateTime gmtTimes = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.print("Current Time in GMT: " + gmtTimes);

        // Get current time in IST (India Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.print("Current Time in IST: " + istTime);

        // Get current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.print("Current Time in PST: " + pstTime);

    }
}
