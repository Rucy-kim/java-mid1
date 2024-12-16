package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("HOURS = " + HOURS);
        System.out.println("HOURS.duration = " + HOURS.getDuration().getSeconds());
        System.out.println("DAYS = " + DAYS);
        System.out.println("DAYS.duration = " + DAYS.getDuration().getSeconds());

        // 차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long secondBetween = SECONDS.between(lt1, lt2);
        System.out.println("between = " + secondBetween);

        long betweenMinute = MINUTES.between(lt1, lt2);
        System.out.println("betweenMinute = " + betweenMinute);

    }
}
