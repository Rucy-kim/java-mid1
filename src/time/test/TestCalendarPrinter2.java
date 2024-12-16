package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("월을 입력하세요: ");
        int month = input.nextInt();
        input.nextLine();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate nextMonth = date.plusMonths(1);

        int offsetDayOfWeek = date.getDayOfWeek().getValue() % 7;

        System.out.println("Su\tMo\tTu\tWe\tTh\tFr\tSa");

        for (int i = 0; i < offsetDayOfWeek; i++) {
            System.out.print(" \t");
        }

        LocalDate dayIterator = date;
        while(dayIterator.isBefore(nextMonth)) {
            System.out.printf("%2d\t", dayIterator.getDayOfMonth());

            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1);
        }
    }
}
