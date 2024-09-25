package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format1 = date.format(DateTimeFormatter.ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);
        System.out.println(format1);
        System.out.println(format2);

        DateTimeFormatter novoPadrao = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", Locale.CHINESE);
        String formatPadrao = LocalDate.now().format(novoPadrao);

        System.out.println(formatPadrao);


    }
}
