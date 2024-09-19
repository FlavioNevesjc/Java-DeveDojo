package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        DateFormat[] df = new DateFormat[6];
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.DEFAULT);
        df[5] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateFormat : df){
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
