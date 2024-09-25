package academy.devdojo.maratonajava.javacore.Rdatas.text;

import java.time.Duration;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        Duration duracao = Duration.between(LocalTime.now(), LocalTime.now().plusHours(10));
        System.out.println(duracao);
        Duration d1 = Duration.ofHours(20);
        System.out.println(d1);
        Duration d2 = Duration.ofDays(2);
        System.out.println(d2);
    }
}
