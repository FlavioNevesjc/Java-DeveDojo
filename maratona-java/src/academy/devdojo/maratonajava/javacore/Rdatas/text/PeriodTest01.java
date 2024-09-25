package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = LocalDate.now().plusYears(10);
        Period p1 = Period.between(now, localDate);
        System.out.println(p1);
    }
}
