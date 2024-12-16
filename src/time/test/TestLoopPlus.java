package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);

        for (int i = 1; i <= 5; i++) {
            System.out.println("날짜 " + i + ": " + date);
            date = date.plusWeeks(2);
        }

        // 기준 날짜를 남기고 싶을 경우
//        LocalDate date = LocalDate.of(2024, 1, 1);
//        for (int i = 0; i < 5; i++) {
//            LocalDate next = date.plusWeeks(2 * i);
//            System.out.println("날짜 " + (i + 1) + ": " + date);
//        }
    }
}
