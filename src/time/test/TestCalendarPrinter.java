package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

import static java.lang.Math.ceil;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("월을 입력하세요: ");
        int month = input.nextInt();
        input.nextLine();

        LocalDate startDate = LocalDate.of(year, month, 1);
        int firstDayOfWeekOffset = startDate.getDayOfWeek().getValue();

        LocalDate lastDate = startDate.with(TemporalAdjusters.lastDayOfMonth());
        int lastDay = lastDate.getDayOfMonth();

        System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");

        for (int i = 1; i <= lastDay + firstDayOfWeekOffset; i++) {
            if (i <= firstDayOfWeekOffset) {
                System.out.print(" \t");
            } else {
                System.out.print((i - firstDayOfWeekOffset) + "\t");
                if (i % 7 == 0) {
                    System.out.println();
                }
            }
        }
        
    }
}
