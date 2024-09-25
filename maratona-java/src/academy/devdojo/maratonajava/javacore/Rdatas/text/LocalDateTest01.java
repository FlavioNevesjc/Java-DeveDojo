package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        Date data = new Date();
        Calendar dataGregoriana = Calendar.getInstance();
        LocalDate date = LocalDate.of(2024, Month.SEPTEMBER,22);
        System.out.println(date.getYear());
        System.out.println(date.getChronology());
        System.out.println(date.getClass());
        System.out.println(LocalDate.now());
    }
}
