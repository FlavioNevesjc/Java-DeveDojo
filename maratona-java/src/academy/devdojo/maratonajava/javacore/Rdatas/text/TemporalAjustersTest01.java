package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek){
            case THURSDAY: addDays = 4; break;
            case FRIDAY: addDays = 3; break;
            case SATURDAY:  addDays = 2; break;
            default: addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAjustersTest01 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data);
        System.out.println(data.getDayOfWeek());

        data = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(data);
        System.out.println(data.getDayOfWeek());

        data = LocalDate.now().withDayOfMonth(11).with(new ObterProximoDiaUtil());
        System.out.println(data);
        System.out.println(data.getDayOfWeek());

        data = LocalDate.now().withDayOfMonth(12).with(new ObterProximoDiaUtil());
        System.out.println(data);
        System.out.println(data.getDayOfWeek());
        data = LocalDate.now().withDayOfMonth(13).with(new ObterProximoDiaUtil());
        System.out.println(data);
        System.out.println(data.getDayOfWeek());
    }
}
