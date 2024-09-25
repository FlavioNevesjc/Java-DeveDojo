package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.Clock;
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.MAX);
        System.out.println(Clock.systemDefaultZone());
    }
}
