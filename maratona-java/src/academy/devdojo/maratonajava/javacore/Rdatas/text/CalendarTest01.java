package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.PM));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.ERA));

        c.add(Calendar.DATE,4);

        System.out.println(c);
    }
}
