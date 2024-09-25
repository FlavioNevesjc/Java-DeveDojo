package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Locale;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId jst = ZoneId.of("Asia/Tokyo");
        System.out.println(jst);
        LocalDateTime now = LocalDateTime.now(jst);
        System.out.println(now);
        Instant now2 = Instant.now();

        ZonedDateTime zoneId2 = now2.atZone(jst);
        System.out.println(zoneId2);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        ZoneOffset zos = ZoneOffset.of("-09:00");
        System.out.println(zos);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(now, zos);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());

        System.out.println(japaneseDate);




    }
}
